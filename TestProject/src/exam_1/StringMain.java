package exam_1;

public class StringMain {
	public static void main(String[] args) {
		StringArray<Character>str=new StringArray<Character>("documentation");
		
		StringArray<Character>str2=new StringArray<Character>("heartless");
		
		int size=str.strlen();
		int size2=str2.strlen();
		
		System.out.println(size);
		System.out.println(size2);
		
		StringArray<Character>str3=new StringArray<Character>(StringArray.strcat(str,str2));
		str3.print();
		
		//System.out.println(StringArray.strcmp(str,str2));
		//System.out.println(StringArray.strcmp(str2,str3));
		//System.out.println(StringArray.strcmp(str,str3));
		
		//str.strcpy(str2);
		//str2.strcpy(str3);
		
		//str.strlwr();
		//str2.strlwr();
		
		//str.strupr();
		//str2.strupr();
		
		str.print();
		str2.print();
	}

}
