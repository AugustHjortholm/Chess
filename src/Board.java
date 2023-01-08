public class Board implements BoardInterface {
    Field[][] board = new Field[8][8];
    public boolean killPiece;

    enum Directions {
        Forward, Backwards, Left, Right, ForwardLeft, ForwardRight, BackwardsRight, BackwardsLeft

    }


    public Board() {
        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 8; j++) {
                board[i][j] = new Field();
            }
        }
        board[0][0].setChessPiece(new Rook("White"));
        board[1][0].setChessPiece(new Knight("White"));
        board[2][0].setChessPiece(new Bishop("White"));
        board[3][0].setChessPiece(new Queen("White"));
        board[4][0].setChessPiece(new King("White"));
        board[5][0].setChessPiece(new Bishop("White"));
        board[6][0].setChessPiece(new Knight("White"));
        board[7][0].setChessPiece(new Rook("White"));

        board[0][1].setChessPiece(new Pawn("White"));
        board[1][1].setChessPiece(new Pawn("White"));
        board[2][1].setChessPiece(new Pawn("White"));
        board[3][1].setChessPiece(new Pawn("White"));
        board[4][1].setChessPiece(new Pawn("White"));
        board[5][1].setChessPiece(new Pawn("White"));
        board[6][1].setChessPiece(new Pawn("White"));
        board[7][1].setChessPiece(new Pawn("White"));

        board[0][7].setChessPiece(new Rook("Black"));
        board[1][7].setChessPiece(new Knight("Black"));
        board[2][7].setChessPiece(new Bishop("Black"));
        board[3][7].setChessPiece(new Queen("Black"));
        board[4][7].setChessPiece(new King("Black"));
        board[5][7].setChessPiece(new Bishop("Black"));
        board[6][7].setChessPiece(new Knight("Black"));
        board[7][7].setChessPiece(new Rook("Black"));

        board[0][6].setChessPiece(new Pawn("Black"));
        board[1][6].setChessPiece(new Pawn("Black"));
        board[2][6].setChessPiece(new Pawn("Black"));
        board[3][6].setChessPiece(new Pawn("Black"));
        board[4][6].setChessPiece(new Pawn("Black"));
        board[5][6].setChessPiece(new Pawn("Black"));
        board[6][6].setChessPiece(new Pawn("Black"));
        board[7][6].setChessPiece(new Pawn("Black"));

    }
    public boolean moveCheck (int moves, int xFrom, int yFrom,Directions directions) {
       ChessPiece pieceType = board[xFrom][yFrom].getChessPiece();
        System.out.println(board[xFrom][yFrom].getChessPiece().getPieceType());
       String[] moveSet = pieceType.getLegalMove();
        for (int i = 0; i < moveSet.length; i += 1) {
            if (moveSet[i].equals(directions.toString()))
                movePiece(moves, xFrom, yFrom, directions);
            return true;
        }
        return false;
    }

    public boolean movePiece(int moves, int xFrom, int yFrom, Directions directions) {
        if (moves <= board[xFrom][yFrom].getChessPiece().getMoves()) {
            switch (directions) {
                case Forward -> {
                    for (int i = 0; i < moves; i++) {
                        movePieceForward(xFrom, yFrom);
                        if (!movePieceForward(xFrom, yFrom) || killPiece) {
                            return true;
                        }
                    }
                }

                case Backwards -> {
                    for (int i = 0; i < moves; i++) {
                        movePieceBackwards(xFrom, yFrom);
                        if (!movePieceBackwards(xFrom, yFrom) || killPiece) {
                            return true;
                        }
                    }

                }
                case Left -> {
                    for (int i = 0; i < moves; i++) {
                        movePieceLeft(xFrom, yFrom);
                        if (!movePieceLeft(xFrom, yFrom) || killPiece) {
                            return true;
                        }
                    }
                }
                case Right -> {
                    for (int i = 0; i < moves; i++) {
                        movePieceRight(xFrom, yFrom);
                        if (!movePieceRight(xFrom, yFrom) || killPiece) {
                            return true;
                        }
                    }
                }
                case ForwardLeft -> {
                    for (int i = 0; i < moves; i++) {
                        movePieceDiagnalLeft(xFrom, yFrom);
                        if (!movePieceDiagnalLeft(xFrom, yFrom) || killPiece) {
                            return true;
                        }
                    }
                }
                case ForwardRight -> {
                    for (int i = 0; i < moves; i++) {
                        movePieceDiagnalRight(xFrom, yFrom);
                        if (!movePieceDiagnalRight(xFrom, yFrom) || killPiece) {
                            return true;
                        }
                    }
                }
                case BackwardsRight -> {
                    for (int i = 0; i < moves; i++) {
                        movePieceDiagnalBackRight(xFrom, yFrom);
                        if (!movePieceDiagnalBackRight(xFrom, yFrom) || killPiece) {
                            return true;
                        }
                    }
                }
                case BackwardsLeft -> {
                    for (int i = 0; i < moves; i++) {
                        movePieceDiagnalBackLeft(xFrom, yFrom);
                        if (!movePieceDiagnalBackLeft(xFrom, yFrom) || killPiece) {
                            return true;
                        }
                    }
                }
            }

        }
        return false;
    }

    public boolean movePieceForward(int xFrom, int yFrom) {
        if (board[xFrom][yFrom].getChessPiece().color.equals("Black") && xFrom - 1 <= 7 && !killPiece) {
            if (board[xFrom + 1][yFrom] == null || board[xFrom + 1][yFrom].getChessPiece().color.equals("White")) {
                ChessPiece hand = board[xFrom][yFrom].getChessPiece();
                board[xFrom][yFrom] = null;
                if (board[xFrom + 1][yFrom].getChessPiece().color.equals("White")) {
                    killPiece = true;
                }
                board[xFrom + 1][yFrom].setChessPiece(hand);
                return true;


                //TODO change value so they line up with the color
            } else if (board[xFrom][yFrom].getChessPiece().color.equals("White") && xFrom - 1 >= 0) {
                if (board[xFrom - 1][yFrom] == null || board[xFrom + 1][yFrom].getChessPiece().color.equals("Black")) {
                    ChessPiece hand = board[xFrom][yFrom].getChessPiece();
                    board[xFrom][yFrom] = null;
                    if (board[xFrom - 1][yFrom].getChessPiece().color.equals("Black")) {
                        killPiece = true;
                    }
                    board[xFrom - 1][yFrom].setChessPiece(hand);
                    return true;
                }
            }
        }
        return false;
    }


    public boolean movePieceBackwards(int xFrom, int yFrom) {
        if (board[xFrom][yFrom].getChessPiece().color.equals("Black") && xFrom + 1 <= 7) {
            if (board[xFrom + 1][yFrom] == null || board[xFrom + 1][yFrom].getChessPiece().color.equals("White")) {
                ChessPiece hand = board[xFrom][yFrom].getChessPiece();
                board[xFrom][yFrom] = null;
                if (board[xFrom + 1][yFrom].getChessPiece().color.equals("White")) {
                    killPiece = true;
                }
                board[xFrom + 1][yFrom].setChessPiece(hand);
                return true;
            }


        } else if (board[xFrom][yFrom].getChessPiece().color.equals("White") && xFrom - 1 >= 0) {
            if (board[xFrom - 1][yFrom] == null || board[xFrom + 1][yFrom].getChessPiece().color.equals("Black")) {
                ChessPiece hand = board[xFrom][yFrom].getChessPiece();
                board[xFrom][yFrom] = null;
                if (board[xFrom - 1][yFrom].getChessPiece().color.equals("Black")) {
                    killPiece = true;
                }
                board[xFrom - 1][yFrom].setChessPiece(hand);
                return true;
            }
        }
        return false;
    }

    public boolean movePieceRight(int xFrom, int yFrom) {
        if (yFrom + 1 <= 7) {
            if (board[xFrom][yFrom + 1] == null || board[xFrom][yFrom + 1].getChessPiece().color.equals("Black")) {
                ChessPiece hand = board[xFrom][yFrom].getChessPiece();
                board[xFrom][yFrom] = null;
                if (board[xFrom][yFrom + 1].getChessPiece().color.equals("Black")) {
                    killPiece = true;
                }
                board[xFrom][yFrom -1].setChessPiece(hand);
                return true;

            }
            return false;
        }
        return false;
    }

    public boolean movePieceLeft ( int xFrom, int yFrom) {
        if (yFrom - 1 >= 0) {
            if (board[xFrom][yFrom - 1] == null || board[xFrom][yFrom - 1].getChessPiece().color.equals("Black")) {
                ChessPiece hand = board[xFrom][yFrom].getChessPiece();
                board[xFrom][yFrom] = null;
                if (board[xFrom][yFrom - 1].getChessPiece().color.equals("Black")) {
                    killPiece = true;
                }
                board[xFrom][yFrom -1].setChessPiece(hand);
                return true;

            }
        }
        return false;
    }

    public boolean movePieceDiagnalRight ( int xFrom, int yFrom){
        if (board[xFrom][yFrom].getChessPiece().color.equals("Black") && xFrom + 1 <= 7 && yFrom + 1 <= 7) {
            if (board[xFrom +1][yFrom + 1] == null || board[xFrom +1][yFrom +1].getChessPiece().color.equals("White")) {
                ChessPiece hand = board[xFrom][yFrom].getChessPiece();
                board[xFrom][yFrom] = null;
                if (board[xFrom +1][yFrom + 1].getChessPiece().color.equals("White")) {
                    killPiece = true;
                }
                board[xFrom +1][yFrom +1].setChessPiece(hand);
                return true;

            }
        }

        else if (board[xFrom][yFrom].getChessPiece().color.equals("White") && xFrom - 1 >= 0 && yFrom - 1 <= 7) {
            if (board[xFrom -1][yFrom + 1] == null || board[xFrom -1][yFrom + 1].getChessPiece().color.equals("Black")) {
                ChessPiece hand = board[xFrom][yFrom].getChessPiece();
                board[xFrom][yFrom] = null;
                if (board[xFrom -1][yFrom + 1].getChessPiece().color.equals("Black")) {
                    killPiece = true;
                }
                board[xFrom -1][yFrom +1].setChessPiece(hand);
                return true;

            }
        }
        return false;
    }

    public boolean movePieceDiagnalLeft ( int xFrom, int yFrom){
        if (board[xFrom][yFrom].getChessPiece().color.equals("Black") && xFrom - 1 <= 7 && yFrom - 1 >= 0) {
            if (board[xFrom -1][yFrom - 1] == null || board[xFrom -1][yFrom - 1].getChessPiece().color.equals("White")) {
                ChessPiece hand = board[xFrom][yFrom].getChessPiece();
                board[xFrom][yFrom] = null;
                if (board[xFrom -1][yFrom - 1].getChessPiece().color.equals("White")) {
                    killPiece = true;
                }
                board[xFrom -1][yFrom -1].setChessPiece(hand);
                return true;
            }


        } else if (board[xFrom][yFrom].getChessPiece().color.equals("White") && xFrom - 1 >= 0 && yFrom - 1 >= 0) {
            if (board[xFrom -1][yFrom - 1] == null || board[xFrom -1][yFrom - 1].getChessPiece().color.equals("White")) {
                ChessPiece hand = board[xFrom][yFrom].getChessPiece();
                board[xFrom][yFrom] = null;
                if (board[xFrom -1][yFrom - 1].getChessPiece().color.equals("White")) {
                    killPiece = true;
                }
                board[xFrom -1][yFrom -1].setChessPiece(hand);
                return true;
            }
        }
        return false;
    }
    public boolean movePieceDiagnalBackLeft ( int xFrom, int yFrom) {
        if (board[xFrom][yFrom].getChessPiece().color.equals("Black") && xFrom + 1 <= 7 && yFrom - 1 >= 0) {
            if (board[xFrom - 1][yFrom - 1] == null || board[xFrom - 1][yFrom - 1].getChessPiece().color.equals("White")) {
                ChessPiece hand = board[xFrom][yFrom].getChessPiece();
                board[xFrom][yFrom] = null;
                if (board[xFrom - 1][yFrom - 1].getChessPiece().color.equals("White")) {
                    killPiece = true;
                }
                board[xFrom - 1][yFrom - 1].setChessPiece(hand);
                return true;
            }

        } else if (board[xFrom][yFrom].getChessPiece().color.equals("White") && xFrom - 1 >= 0 && yFrom - 1 >= 0) {
            if (board[xFrom + 1][yFrom - 1] == null || board[xFrom + 1][yFrom - 1].getChessPiece().color.equals("White")) {
                ChessPiece hand = board[xFrom][yFrom].getChessPiece();
                board[xFrom][yFrom] = null;
                if (board[xFrom + 1][yFrom - 1].getChessPiece().color.equals("White")) {
                    killPiece = true;
                }
                board[xFrom - 1][yFrom + 1].setChessPiece(hand);
                return true;
            }

        }
        return false;
    }
        public boolean movePieceDiagnalBackRight ( int xFrom, int yFrom) {
            if (board[xFrom][yFrom].getChessPiece().color.equals("Black") && xFrom + 1 <= 7 && yFrom - 1 >= 0) {
                if (board[xFrom - 1][yFrom + 1] == null || board[xFrom - 1][yFrom + 1].getChessPiece().color.equals("White")) {
                    ChessPiece hand = board[xFrom][yFrom].getChessPiece();
                    board[xFrom][yFrom] = null;
                    if (board[xFrom - 1][yFrom + 1].getChessPiece().color.equals("White")) {
                        killPiece = true;
                    }
                    board[xFrom - 1][yFrom + 1].setChessPiece(hand);
                    return true;
                }


            } else if (board[xFrom][yFrom].getChessPiece().color.equals("White") && xFrom - 1 >= 0 && yFrom + 1 <= 7) {
                if (board[xFrom - 1][yFrom + 1] == null || board[xFrom - 1][yFrom + 1].getChessPiece().color.equals("Black")) {
                    ChessPiece hand = board[xFrom][yFrom].getChessPiece();
                    board[xFrom][yFrom] = null;
                    if (board[xFrom - 1][yFrom - 1].getChessPiece().color.equals("Black")) {
                        killPiece = true;
                    }
                    board[xFrom - 1][yFrom - 1].setChessPiece(hand);
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

