import org.omg.Messaging.SyncScopeHelper;

public class Book {

	private String id;
	private String group;
	private String name;
	private String author;
	private Boolean rent;
	private int point;

	
	public Book(){
		
	}
	public Book(String name, String id, String author, String group) {
		this.name = name;
		this.id = id;
		this.author = author;
		this.group = group;
		this.rent = true;
		this.point = 0;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return this.id;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getGroup() {
		return this.group;
	}

	public void setRent(Boolean rent) {
		if (rent == true) {
			this.rent = true;
		} else {
			this.rent = false;
		}
	}
	public Boolean getRent(){
		return this.rent;
	}
	
	public void setPoint(){
		this.point++;
	}
	public int getPoint(){
		return this.point;
	}

	
	
	public String toString(){
		if(this.rent == true){
			return "      " + getId() + " " + getGroup() + "    " + getName();
		}else{
			return "�뿩��    " + getId() + " " + getGroup() + "    " + getName();
		}
		
	}
	
}