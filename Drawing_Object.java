import java.awt.*;

public interface DrawingObject
{
        private int originX, originY;

        public void draw( Graphics g );
        public void start( Point p );
        public void drag( Point p );
        public void move( Point p );
        public void setBounds( Rectangle b );
        public boolean contains( Point p );
}
