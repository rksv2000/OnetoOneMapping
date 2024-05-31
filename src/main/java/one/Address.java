package one;

import java.util.Objects;

import jakarta.persistence.*;

@Entity
@Table(name="address")
public class Address {
   
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private Long id;
   private String street;
   private String city;
   public Address(Long id, String street, String city) {
		super();
		this.id = id;
		this.street = street;
		this.city = city;
	}
   public Address() {}
   public Long getId() {
		return id;
	}
   public void setId(Long id) {
		this.id = id;
	}
   public String getStreet() {
		return street;
	}
   public void setStreet(String street) {
		this.street = street;
	}
   public String getCity() {
		return city;
	}
   public void setCity(String city) {
		this.city = city;
	}
   @Override
   public boolean equals(Object o) {
       if (this == o) return true;
       if (o == null || getClass() != o.getClass()) return false;
       Address address = (Address) o;
       return Objects.equals(id, address.id);
   }

   @Override
   public int hashCode() {
       return Objects.hash(id);
   }
  
}
