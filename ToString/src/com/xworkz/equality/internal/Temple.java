package com.xworkz.equality.internal;

public class Temple {

	private String name;

	public Temple(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return 888;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals in Temple");

		if (obj != null) {
			if (obj instanceof Temple) {
				Temple casted = (Temple) obj;
				System.out.println(this.name);
				System.out.println(casted.name);
				if (this.name.equals(casted.name)) {
					return true;
				}
			}
		}

		return super.equals(obj);
	}

}
