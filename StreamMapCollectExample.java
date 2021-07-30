package com.javaguides.tutorial.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class StreamMapCollectExample {

	public static void main(String[] args) {
		
		List<User> users = new ArrayList<User>();
		users.add(new User(1, "Codex", "friends!","codex@email.com"));
		users.add(new User(2, "Zaboo", "girlfriend","zaboo@email.com"));
		users.add(new User(3, "Tinkerballa", "cosplay","tinkerballa@email.com"));
		
		// WITHOUT API:
		List<UserDTO> usersDto = new ArrayList<UserDTO>();
		for(User user : users) {
			usersDto.add(new UserDTO(user.getId(), user.getUsername(), user.getEmail()));
		}
		for(UserDTO dto : usersDto) {
			System.out.println(dto);
		}
		
		// WITH STREAM API - using a function interface - .stream().map() 
		users.stream().map(new Function<User, UserDTO>() {
			@Override
			public UserDTO apply(User user) {
				return new UserDTO(user.getId(), user.getUsername(), user.getEmail());
			}
		});
		
		//STREAM API - using lambda expressions
		users.stream().map((User user) -> new UserDTO(user.getId(), user.getUsername(), user.getEmail())).forEach(System.out::println);

	}

}


class UserDTO {
	
	private int id;
	private String username;
	private String email;
	
	public UserDTO(int id, String username, String email) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", email=" + email + "]";
	}
	
}


class User {
	
	private int id;
	private String username;
	private String password;
	private String email;
	
	public User(int id, String username, String password, String email) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + "]";
	}
	
}

