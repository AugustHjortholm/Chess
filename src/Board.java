public class Board implements BoardInterface {
    Field[][] board = new Field[8][8];
    public boolean killPiece;

    enum Directions {
        Forward, Backwards, Left, Right, ForwardLeft, ForwardRight, BackwardsRight, BackwardsLeft

    }


    public Board() {
        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 8; j++) {
                board [i][j] = new Field();
            }
        }
        //TODO swap x and y positions
        board[0][0].setChessPiece(new Rook("White"));
        board[0][1].setChessPiece(new Knight("White"));
        board[0][2].setChessPiece(new Bishop("White"));
        board[0][3].setChessPiece(new Queen("White"));
        board[0][4].setChessPiece(new King("White"));
        board[0][5].setChessPiece(new Bishop("White"));
        board[0][6].setChessPiece(new Knight("White"));
        board[0][7].setChessPiece(new Rook("White"));

        board[1][0].setChessPiece(new Pawn("White"));
        board[1][1].setChessPiece(new Pawn("White"));
        board[1][2].setChessPiece(new Pawn("White"));
        board[1][3].setChessPiece(new Pawn("White"));
        board[1][4].setChessPiece(new Pawn("White"));
        board[1][5].setChessPiece(new Pawn("White"));
        board[1][6].setChessPiece(new Pawn("White"));
        board[1][7].setChessPiece(new Pawn("White"));

        board[7][0].setChessPiece(new Rook("Black"));
        board[7][1].setChessPiece(new Knight("Black"));
        board[7][2].setChessPiece(new Bishop("Black"));
        board[7][3].setChessPiece(new Queen("Black"));
        board[7][4].setChessPiece(new King("Black"));
        board[7][5].setChessPiece(new Bishop("Black"));
        board[7][6].setChessPiece(new Knight("Black"));
        board[7][7].setChessPiece(new Rook("Black"));

        board[6][0].setChessPiece(new Pawn("Black"));
        board[6][1].setChessPiece(new Pawn("Black"));
        board[6][2].setChessPiece(new Pawn("Black"));
        board[6][3].setChessPiece(new Pawn("Black"));
        board[6][4].setChessPiece(new Pawn("Black"));
        board[6][5].setChessPiece(new Pawn("Black"));
        board[6][6].setChessPiece(new Pawn("Black"));
        board[6][7].setChessPiece(new Pawn("Black"));

    }
    public boolean movePiece(int moves, int xFrom, int yFrom, Directions directions) {
        if (board[xFrom][yFrom].getChessPiece() != null) {
            switch (directions) {
                case Forward -> {
                    for (int i = 0; i < moves; i++) {
                        boolean j = movePieceForward(xFrom, yFrom);
                        if (!j || killPiece) {
                            return false;
                        }
                    }
                }

                case Backwards -> {
                    for (int i = 0; i < moves; i++) {
                        movePieceBackwards(xFrom, yFrom);
                        if (!movePieceBackwards(xFrom, yFrom) || killPiece) {
                            return false;
                        }
                    }

                }
                case Left -> {
                    for (int i = 0; i < moves; i++) {
                        movePieceLeft(xFrom, yFrom);
                        if (!movePieceLeft(xFrom, yFrom) || killPiece) {
                            return false;
                        }
                    }
                }
                case Right -> {
                    for (int i = 0; i < moves; i++) {
                        movePieceRight(xFrom, yFrom);
                        if (!movePieceRight(xFrom, yFrom) || killPiece) {
                            return false;
                        }
                    }
                }
                case ForwardLeft -> {
                    for (int i = 0; i < moves; i++) {
                        movePieceDiagnalLeft(xFrom, yFrom);
                        if (!movePieceDiagnalLeft(xFrom, yFrom) || killPiece) {
                            return false;
                        }
                    }
                }
                case ForwardRight -> {
                    for (int i = 0; i < moves; i++) {
                        movePieceDiagnalRight(xFrom, yFrom);
                        if (!movePieceDiagnalRight(xFrom, yFrom) || killPiece) {
                            return false;
                        }
                    }
                }
                case BackwardsRight -> {
                    for (int i = 0; i < moves; i++) {
                        movePieceDiagnalBackRight(xFrom, yFrom);
                        if (!movePieceDiagnalBackRight(xFrom, yFrom) || killPiece) {
                            return false;
                        }
                    }
                }
                case BackwardsLeft -> {
                    for (int i = 0; i < moves; i++) {
                        movePieceDiagnalBackLeft(xFrom, yFrom);
                        if (!movePieceDiagnalBackLeft(xFrom, yFrom) || killPiece) {
                            return false;
                        }
                    }
                }
            }

        }
        return true;
    }

    public boolean movePieceForward(int xFrom, int yFrom) {
        if (board[xFrom][yFrom].getChessPiece().color.equals("White") && xFrom + 1 <= 7 && !killPiece) {
            if (board[xFrom + 1][yFrom].getChessPiece() == null || board[xFrom + 1][yFrom].getChessPiece().color.equals("Black")){
                        ChessPiece hand = board[xFrom][yFrom].getChessPiece();
                        board[xFrom][yFrom].setChessPiece(null);
                        if (board[xFrom + 1][yFrom].isEmpty()) {
                            killPiece = true;
                        }

                        board[xFrom + 1][yFrom].setChessPiece(hand);

                return true;



                //TODO på alle movePiece
            } else if (board[xFrom][yFrom].getChessPiece().color.equals("Black") && xFrom - 1 >= 0) {
                if (board[xFrom - 1][yFrom] == null) {
                    ChessPiece hand = board[xFrom][yFrom].getChessPiece();
                    board[xFrom][yFrom] = null;
                    board[xFrom - 1][yFrom].setChessPiece(hand);
                    return true;
                }
            }
        }
        return false;
    }


        public boolean movePieceBackwards ( int xFrom, int yFrom){
            if (board[xFrom][yFrom].getChessPiece().color.equals("Black") && xFrom + 1 <= 7) {
                if (board[xFrom + 1][yFrom] == null) {
                    ChessPiece hand = board[xFrom][yFrom].getChessPiece();
                    board[xFrom][yFrom] = null;
                    board[xFrom + 1][yFrom].setChessPiece(hand);
                    return true;
                }


            } else if (board[xFrom][yFrom].getChessPiece().color.equals("White") && xFrom - 1 >= 0) {
                if (board[xFrom - 1][yFrom] == null) {
                    ChessPiece hand = board[xFrom][yFrom].getChessPiece();
                    board[xFrom][yFrom] = null;
                    board[xFrom - 1][yFrom].setChessPiece(hand);
                    return true;
                }
            }
            return false;
        }

        public boolean movePieceRight ( int xFrom, int yFrom){
            if (yFrom + 1 <= 7) {
                if (board[xFrom][yFrom + 1] == null) {
                    ChessPiece hand = board[xFrom][yFrom].getChessPiece();
                    board[xFrom][yFrom] = null;
                    board[xFrom][yFrom + 1].setChessPiece(hand);
                    return true;
                }


            }
            return false;
        }
        public boolean movePieceLeft ( int xFrom, int yFrom){
            if (yFrom - 1 >= 0) {
                if (board[xFrom][yFrom - 1] == null) {
                    ChessPiece hand = board[xFrom][yFrom].getChessPiece();
                    board[xFrom][yFrom] = null;
                    board[xFrom][yFrom - 1].setChessPiece(hand);
                    return true;
                }


            }
            return false;
        }

        public boolean movePieceDiagnalRight ( int xFrom, int yFrom){
            if (board[xFrom][yFrom].getChessPiece().color.equals("Black") && xFrom + 1 <= 7 && yFrom + 1 <= 7) {
                if (board[xFrom + 1][yFrom + 1] == null) {
                    ChessPiece hand = board[xFrom][yFrom].getChessPiece();
                    board[xFrom][yFrom] = null;
                    board[xFrom + 1][yFrom + 1].setChessPiece(hand);
                    return true;
                }


            } else if (board[xFrom][yFrom].getChessPiece().color.equals("White") && xFrom - 1 >= 0 && yFrom + 1 <= 7) {
                if (board[xFrom - 1][yFrom + 1] == null) {
                    ChessPiece hand = board[xFrom][yFrom].getChessPiece();
                    board[xFrom][yFrom] = null;
                    board[xFrom - 1][yFrom + 1].setChessPiece(hand);
                    return true;
                }
            }
            return false;
        }
        public boolean movePieceDiagnalLeft ( int xFrom, int yFrom){
            if (board[xFrom][yFrom].getChessPiece().color.equals("Black") && xFrom + 1 <= 7 && yFrom - 1 >= 0) {
                if (board[xFrom + 1][yFrom - 1] == null) {
                    ChessPiece hand = board[xFrom][yFrom].getChessPiece();
                    board[xFrom][yFrom] = null;
                    board[xFrom + 1][yFrom - 1].setChessPiece(hand);
                    return true;
                }


            } else if (board[xFrom][yFrom].getChessPiece().color.equals("White") && xFrom - 1 >= 0 && yFrom - 1 >= 0) {
                if (board[xFrom - 1][yFrom - 1] == null) {
                    ChessPiece hand = board[xFrom][yFrom].getChessPiece();
                    board[xFrom][yFrom] = null;
                    board[xFrom - 1][yFrom - 1].setChessPiece(hand);
                    return true;
                }
            }
            return false;
        }
        public boolean movePieceDiagnalBackLeft ( int xFrom, int yFrom){
            if (board[xFrom][yFrom].getChessPiece().color.equals("White") && xFrom + 1 <= 7 && yFrom - 1 >= 0) {
                if (board[xFrom + 1][yFrom - 1] == null) {
                    ChessPiece hand = board[xFrom][yFrom].getChessPiece();
                    board[xFrom][yFrom] = null;
                    board[xFrom + 1][yFrom - 1].setChessPiece(hand);
                    return true;
                }


            } else if (board[xFrom][yFrom].getChessPiece().color.equals("Black") && xFrom - 1 >= 0 && yFrom - 1 >= 0) {
                if (board[xFrom - 1][yFrom - 1] == null) {
                    ChessPiece hand = board[xFrom][yFrom].getChessPiece();
                    board[xFrom][yFrom] = null;
                    board[xFrom - 1][yFrom - 1].setChessPiece(hand);
                    return true;
                }
            }
            return false;
        }
        public boolean movePieceDiagnalBackRight ( int xFrom, int yFrom){
            if (board[xFrom][yFrom].getChessPiece().color.equals("White") && xFrom + 1 <= 7 && yFrom + 1 <= 7) {
                if (board[xFrom + 1][yFrom + 1] == null) {
                    ChessPiece hand = board[xFrom][yFrom].getChessPiece();
                    board[xFrom][yFrom] = null;
                    board[xFrom + 1][yFrom + 1].setChessPiece(hand);
                    return true;
                }


            } else if (board[xFrom][yFrom].getChessPiece().color.equals("Black") && xFrom - 1 >= 0 && yFrom + 1 <= 7) {
                if (board[xFrom - 1][yFrom + 1] == null) {
                    ChessPiece hand = board[xFrom][yFrom].getChessPiece();
                    board[xFrom][yFrom] = null;
                    board[xFrom - 1][yFrom + 1].setChessPiece(hand);
                    return true;
                }
            }
            return false;
        }

        // TODO
        @Override
        public Field[][] getBoardState () {
            return board;
        }

        public void setKillPiece ( boolean killPiece){
            this.killPiece = killPiece;
        }
    }

