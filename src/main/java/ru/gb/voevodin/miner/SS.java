/*package ru.gb.voevodin.miner;



public class GameLogic extends JFrame{
    int w = 0;
    int h =0;

    int[][] mine;

    public void creatingGameWindow(int[][] game_bord, int width, int height, int multiplication){
        mine = new int[width][height];
        w = width;
        h = height;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                mine[i][j] = 0;

            }
        }

        setTitle("Найди мины");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, width*60, height*60);
        Font font8 = new Font("Arial", Font.BOLD, 8);
        setLayout(new GridLayout(width, height));
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                add(new JButton(String.valueOf(mine[i][j])));
                ActionListener = new ActionListener(this) {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        mine[finalI][finalJ] = game_bord[finalI][finalJ] ;
                    }
                };

            }


        }


        setVisible(true);
    }

}*/
