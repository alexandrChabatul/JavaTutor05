package by.epam.chebatul.task5.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import by.epam.chebatul.task5.entity.flower.Flower;
import by.epam.chebatul.task5.entity.pack.Pack;

public class FlowerComposition {

	private List<Flower> flowers = new ArrayList<>();
	private Pack pack;

	public FlowerComposition() {
	}

	public FlowerComposition(List<Flower> flowers, Pack pack) {
		super();
		this.flowers = flowers;
		this.pack = pack;
	}

	public List<Flower> getFlowers() {
		return flowers;
	}

	public void setFlowers(List<Flower> flowers) {
		this.flowers = flowers;
	}

	public Pack getPack() {
		return pack;
	}

	public void setPack(Pack pack) {
		this.pack = pack;
	}
	
	public void addFlower(Flower flower) {
		flowers.add(flower);
	}

	@Override
	public int hashCode() {
		return Objects.hash(flowers, pack);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FlowerComposition other = (FlowerComposition) obj;
		return Objects.equals(flowers, other.flowers) && Objects.equals(pack, other.pack);
	}

	@Override
	public String toString() {
		return "FlowerComposition [flowers=" + flowers + ", pack=" + pack + "]";
	}

}
