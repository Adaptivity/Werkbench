package werkbench.bench;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.world.World;
import werkbench.reference.Compendium;

public class BenchGUI extends GuiContainer
{

	public BenchGUI(InventoryPlayer inventoryPlayer, BenchTileEntity bench, World world)
	{
		super(new BenchContainer(inventoryPlayer, bench, world));

	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float opacity, int mousex, int mousey)
	{
		this.mc.renderEngine.bindTexture(Compendium.Texture.GUI.background);
		int x = (width - xSize) / 2;
		int y = (height - ySize) / 2;
		drawTexturedModalRect(x, y, 0, 0, xSize, ySize);
	}

}
