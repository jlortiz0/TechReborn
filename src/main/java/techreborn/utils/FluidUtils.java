/*
 * This file is part of TechReborn, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2018 TechReborn
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package techreborn.utils;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import reborncore.common.util.RebornInventory;
import reborncore.common.util.Tank;
import reborncore.fluid.Fluid;
import reborncore.fluid.FluidStack;

import java.util.Collections;
import java.util.List;

public class FluidUtils {

	public static Fluid fluidFromBlock(Block bLock){
		throw new UnsupportedOperationException("needs coding");
	}

	public static List<Fluid> getAllFluids() {
		return Collections.emptyList();
	}

	public static Fluid getFluid(String name){
		return null;
	}

	public static void drainContainers(Tank tank, RebornInventory<?> inventory, int i, int i1) {

	}

	public static void fillContainers(Tank tank, RebornInventory<?> inventory, int i, int i1, Fluid fluidType) {

	}

	public static boolean fluidEquals(Fluid fluid, Fluid fluid1) {
		return false;
	}

	public static FluidStack getFluidStackInContainer(ItemStack invStack) {
		return null;
	}
}
