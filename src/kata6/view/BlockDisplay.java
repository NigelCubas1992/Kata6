package kata6.view;

import kata6.model.Block;

public interface BlockDisplay extends Block.Observer {
    Block block();
    void display(Block block);

}
