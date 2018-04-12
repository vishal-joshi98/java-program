import java.io.*;
class FileDemo
{
	public static void main(String[] args) {
		File f1=new File("vishal.txt");
		System.out.println("File name:"+f1.getName());
		System.out.println("path:"+f1.getPath());
		System.out.println("abs path:"+f1.getAbsolutePath());
		System.out.println("parent:"+f1.getParent());
		System.out.println(f1.exists());
		System.out.println(f1.canWrite()?"is writeable":"is not writeable");
        System.out.println(f1.canRead()?"is readable":"is not readable");
        System.out.println("is"+(f1.isDirectory()?"":"not directory"));
        System.out.println(f1.isFile()?"is normal file":"is not file");
        System.out.println(f1.isAbsolute()?"is absolute":"is not absolte");
        System.out.println("file is last modified:"+f1.lastModified());
        System.out.println("file size:"+f1.length()+"bytes");
	}
}