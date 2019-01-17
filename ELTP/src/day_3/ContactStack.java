package day_3;

import java.util.Stack;

import day_2.Contact;

public class ContactStack extends Stack<Contact>{
	int limit;
	
	
	public ContactStack(int limit) {
		super();
		this.limit = limit;
	}

	@Override
	public synchronized Contact pop() {
		// TODO Auto-generated method stub
		if(this.empty()){
			try {
				throw new Exception("Stack Is Empty Bro...");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Popped Successfully");
		return super.pop();
	}
	
	@Override
	public Contact push(Contact item) {
		try {
			if(!item.validate()){
				System.out.println("\n---->Item Not Validated.");
			}
			if(this.size()==limit){
				System.out.println("Stack Size : "+this.size());
				throw new Exception("Stack is Already Full Bro..");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return item;
			
		}
		System.out.println("Pushed Successfully");
		return super.push(item);
		
	}
	
	

}
