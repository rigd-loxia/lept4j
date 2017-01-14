package net.sourceforge.lept4j;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.PointerByReference;
import java.util.Arrays;
import java.util.List;
/**
 * Heap of arbitrary void* data<br>
 * <i>native declaration : heap.h:6</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class L_Heap extends Structure {
	/**
	 * size of allocated ptr array<br>
	 * C type : l_int32
	 */
	public int nalloc;
	/**
	 * number of elements stored in the heap<br>
	 * C type : l_int32
	 */
	public int n;
	/**
	 * ptr array<br>
	 * C type : void**
	 */
	public PointerByReference array;
	/**
	 * L_SORT_INCREASING or L_SORT_DECREASING<br>
	 * C type : l_int32
	 */
	public int direction;
	public L_Heap() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("nalloc", "n", "array", "direction");
	}
	/**
	 * @param nalloc size of allocated ptr array<br>
	 * C type : l_int32<br>
	 * @param n number of elements stored in the heap<br>
	 * C type : l_int32<br>
	 * @param array ptr array<br>
	 * C type : void**<br>
	 * @param direction L_SORT_INCREASING or L_SORT_DECREASING<br>
	 * C type : l_int32
	 */
	public L_Heap(int nalloc, int n, PointerByReference array, int direction) {
		super();
		this.nalloc = nalloc;
		this.n = n;
		this.array = array;
		this.direction = direction;
	}
	public L_Heap(Pointer peer) {
		super(peer);
		read();
	}
	public static class ByReference extends L_Heap implements Structure.ByReference {
		
	};
	public static class ByValue extends L_Heap implements Structure.ByValue {
		
	};
}
