package com.example.project5;
/**
 * @author Terry Nguyen, Olivia Schroeder
 * These are all the toppings the pizzeria offers, each is associated with a link to a picture of the topic used in the GUI
 */
public enum Topping {
    Pepperoni("https://png.pngtree.com/png-clipart/20230218/ourmid/pngtree-beef-pepperoni-png-image_6605978.png"),
    Sausage("https://static.vecteezy.com/system/resources/thumbnails/048/053/567/small_2x/fresh-sausage-cut-out-isolated-transparent-background-png.png"),
    GreenPepper("https://png.pngtree.com/png-clipart/20231018/original/pngtree-sliced-green-pepper-isolated-on-white-pepper-photo-png-image_13351080.png"),
    Onion("https://static.vecteezy.com/system/resources/previews/040/453/002/non_2x/ai-generated-onion-cut-in-half-isolated-on-transparent-background-free-png.png"),
    BBQChicken("https://static.vecteezy.com/system/resources/previews/021/665/578/non_2x/delicious-grilled-chicken-cutout-png.png"),
    Provolone("https://dfwblobstorage.blob.core.windows.net/images/Cheese/variety-cutouts/Cutout_Provolone.png"),
    Cheddar("https://static.vecteezy.com/system/resources/previews/047/601/341/non_2x/sliced-cheddar-cheese-pieces-cut-out-stock-png.png"),
    Beef("https://png.pngtree.com/png-vector/20240124/ourmid/pngtree-picanha-traditional-brazilian-beef-cut-png-image_11484353.png"),
    Ham("https://static.vecteezy.com/system/resources/previews/047/456/737/non_2x/sliced-ham-on-a-transparent-background-png.png"),
    Mushroom("https://png.pngitem.com/pimgs/s/137-1374463_mushroom-png-background-shiitake-mushroom-cut-in-half.png"),
    BlackOlives("https://png.pngtree.com/png-clipart/20231015/original/pngtree-black-olives-pile-photo-png-image_13306614.png"),
    Spinach("https://static.vecteezy.com/system/resources/thumbnails/046/156/875/small/pile-of-vibrant-green-spinach-fresh-and-healthy-food-isolated-on-background-png.png"),
    Pineapple("https://i.pinimg.com/736x/26/3c/71/263c71bbb3b4b82b3b741721e72ac339.jpg");
    private final String imageUrl;
    Topping(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    public String getImageUrl() {
        return imageUrl;
    }
}
