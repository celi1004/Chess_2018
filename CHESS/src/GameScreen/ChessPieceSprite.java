package GameScreen;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 * A class to maintain ChessPiece Images.
 * <p>
 * this class load Sprite atlas and generate BufferedImage for each chess piece
 * 
 * @see ChessPieceSpriteType
 * @see BufferedImage
 * @author LeNerd
 * @since 2018-05-23
 */
public class ChessPieceSprite {
	/**
	 * This represents possible chess pieces.
	 * 
	 * @author LeNerd
	 *
	 */
	public enum ChessPieceSpriteType {
		BLACK_KING(5, 0), BLACK_QUEEN(4, 0), BLACK_LOOK(3, 0), BLACK_KNIGHT(1, 0), BLACK_BISHOP(2, 0), BLACK_PAWN(0, 0),

		WHITE_KING(5, 1), WHITE_QUEEN(4, 1), WHITE_LOOK(3, 1), WHITE_KNIGHT(1, 1), WHITE_BISHOP(2, 1), WHITE_PAWN(0, 1),

		PURPLE_KING(5, 11), PURPLE_QUEEN(4, 11), PURPLE_LOOK(3, 11), PURPLE_KNIGHT(1, 11), PURPLE_BISHOP(2, 11), PURPLE_PAWN(0, 11),
		
		ORANGE_KING(5, 6), ORANGE_QUEEN(4, 6), ORANGE_LOOK(3, 6), ORANGE_KNIGHT(1, 6), ORANGE_BISHOP(2, 6), ORANGE_PAWN(0, 6),
		
		GREEN_KING(5, 8), GREEN_QUEEN(4, 8), GREEN_LOOK(3, 8), GREEN_KNIGHT(1,8), GREEN_BISHOP(2, 8), GREEN_PAWN(0, 8),
		
		BLUE_KING(5, 10), BLUE_QUEEN(4, 10), BLUE_LOOK(3,10), BLUE_KNIGHT(1,10), BLUE_BISHOP(2, 10), BLUE_PAWN(0, 10);
		
		int x;
		int y;

		private ChessPieceSpriteType(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public String getKey() {
			return x + "," + y;
		}
	}
	
	private static ChessPieceSprite instance = new ChessPieceSprite();
	BufferedImage imgAtlas;
	Map<String, BufferedImage> sprites;

	protected ChessPieceSprite() {
		try {
			imgAtlas = ImageIO.read(new File("sprite2.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		sprites = new HashMap<>();
	}

	/**
	 * returns current instance of ChessPieceSprite
	 * 
	 * @return instance of ChessPieceSprite
	 */
	public static ChessPieceSprite getInstace() {
		return instance;
	}

	/**
	 * returns BufferedImage for given ChessPieceSpriteType
	 * <p>
	 * this function generates BufferedImage for first time for each
	 * ChessPieceSpriteType. any subsequent call is cached.
	 * 
	 * @param type
	 *            type of chess piece
	 * 
	 * @return BufferedImage for given ChessPieceSpriteType.
	 */
	public BufferedImage getChessPiece(ChessPieceSpriteType type) {
		if (sprites.get(type.getKey()) == null) {
			sprites.put(type.getKey(), getSpriteFromAtlas(type));
		}

		return sprites.get(type.getKey());
	}
	
	private BufferedImage getSpriteFromAtlas(ChessPieceSpriteType type) {
		int w = imgAtlas.getWidth() / 6;
		int h = imgAtlas.getHeight() / 12;
		BufferedImage img = new BufferedImage(w, h, imgAtlas.getType());

		Graphics g = img.getGraphics();

		g.drawImage(imgAtlas, 0, 0, w, h, type.x * w, type.y * h, type.x * w + w, type.y * h + h, null);
		//imaAtlas의 (0,0,w,h)영역을 (type.x*w, type.y*h, type,x*w + w, tpye.y*h+ h)에 그린다.
		//마지막 인수는 image Observer 계속 관찰하고 있다가 다 업데이트 되면 불러dha?

		// g.dispose();

		return img;
	}
	
}

