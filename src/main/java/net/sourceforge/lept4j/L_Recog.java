package net.sourceforge.lept4j;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.IntByReference;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : recog.h:117</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class L_Recog extends Structure {
	/**
	 * scale all examples to this width;<br>
	 * C type : l_int32
	 */
	public int scalew;
	/**
	 * scale all examples to this height;<br>
	 * C type : l_int32
	 */
	public int scaleh;
	/**
	 * template type: either an average of<br>
	 * C type : l_int32
	 */
	public int templ_type;
	/**
	 * initialize container arrays to this<br>
	 * C type : l_int32
	 */
	public int maxarraysize;
	/**
	 * size of character set<br>
	 * C type : l_int32
	 */
	public int setsize;
	/**
	 * for binarizing if depth &gt; 1<br>
	 * C type : l_int32
	 */
	public int threshold;
	/**
	 * vertical jiggle on nominal centroid<br>
	 * C type : l_int32
	 */
	public int maxyshift;
	/**
	 * +- allowed fractional asperity ratio<br>
	 * C type : l_float32
	 */
	public float asperity_fr;
	/**
	 * one of L_ARABIC_NUMERALS, etc.<br>
	 * C type : l_int32
	 */
	public int charset_type;
	/**
	 * expected number of classes in charset<br>
	 * C type : l_int32
	 */
	public int charset_size;
	/**
	 * dir with bootstrap pixa charsets<br>
	 * C type : char*
	 */
	public Pointer bootdir;
	/**
	 * file pattern for bootstrap pixa charsets<br>
	 * C type : char*
	 */
	public Pointer bootpattern;
	/**
	 * path for single bootstrap pixa charset<br>
	 * C type : char*
	 */
	public Pointer bootpath;
	/**
	 * number of 2x2 erosion iters on boot pixa<br>
	 * C type : l_int32
	 */
	public int boot_iters;
	/**
	 * min number of samples without padding<br>
	 * C type : l_int32
	 */
	public int min_nopad;
	/**
	 * max number of samples after padding<br>
	 * C type : l_int32
	 */
	public int max_afterpad;
	/**
	 * min num of total samples; else use boot<br>
	 * C type : l_int32
	 */
	public int min_samples;
	/**
	 * keep track of number of training samples<br>
	 * C type : l_int32
	 */
	public int num_samples;
	/**
	 * min width of averaged unscaled templates<br>
	 * C type : l_int32
	 */
	public int minwidth_u;
	/**
	 * max width of averaged unscaled templates<br>
	 * C type : l_int32
	 */
	public int maxwidth_u;
	/**
	 * min height of averaged unscaled templates<br>
	 * C type : l_int32
	 */
	public int minheight_u;
	/**
	 * max height of averaged unscaled templates<br>
	 * C type : l_int32
	 */
	public int maxheight_u;
	/**
	 * min width of averaged scaled templates<br>
	 * C type : l_int32
	 */
	public int minwidth;
	/**
	 * max width of averaged scaled templates<br>
	 * C type : l_int32
	 */
	public int maxwidth;
	/**
	 * set to 1 when averaged bitmaps are made<br>
	 * C type : l_int32
	 */
	public int ave_done;
	/**
	 * set to 1 when training is complete or<br>
	 * C type : l_int32
	 */
	public int train_done;
	/**
	 * min component width kept in splitting<br>
	 * C type : l_int32
	 */
	public int min_splitw;
	/**
	 * min component height kept in splitting<br>
	 * C type : l_int32
	 */
	public int min_splith;
	/**
	 * max component height kept in splitting<br>
	 * C type : l_int32
	 */
	public int max_splith;
	/**
	 * text array for arbitrary charset<br>
	 * C type : Sarray*
	 */
	public net.sourceforge.lept4j.Sarray.ByReference sa_text;
	/**
	 * index-to-char lut for arbitrary charset<br>
	 * C type : L_Dna*
	 */
	public net.sourceforge.lept4j.L_Dna.ByReference dna_tochar;
	/**
	 * table for finding centroids<br>
	 * C type : l_int32*
	 */
	public IntByReference centtab;
	/**
	 * table for finding pixel sums<br>
	 * C type : l_int32*
	 */
	public IntByReference sumtab;
	/**
	 * all unscaled bitmaps for each class<br>
	 * C type : Pixaa*
	 */
	public net.sourceforge.lept4j.Pixaa.ByReference pixaa_u;
	/**
	 * averaged unscaled bitmaps per class<br>
	 * C type : Pixa*
	 */
	public net.sourceforge.lept4j.Pixa.ByReference pixa_u;
	/**
	 * centroids of all unscaled bitmaps<br>
	 * C type : Ptaa*
	 */
	public net.sourceforge.lept4j.Ptaa.ByReference ptaa_u;
	/**
	 * centroids of unscaled averaged bitmaps<br>
	 * C type : Pta*
	 */
	public net.sourceforge.lept4j.Pta.ByReference pta_u;
	/**
	 * area of all unscaled bitmap examples<br>
	 * C type : Numaa*
	 */
	public net.sourceforge.lept4j.Numaa.ByReference naasum_u;
	/**
	 * area of unscaled averaged bitmaps<br>
	 * C type : Numa*
	 */
	public net.sourceforge.lept4j.Numa.ByReference nasum_u;
	/**
	 * all bitmap examples for each class<br>
	 * C type : Pixaa*
	 */
	public net.sourceforge.lept4j.Pixaa.ByReference pixaa;
	/**
	 * averaged bitmaps for each class<br>
	 * C type : Pixa*
	 */
	public net.sourceforge.lept4j.Pixa.ByReference pixa;
	/**
	 * centroids of all bitmap examples<br>
	 * C type : Ptaa*
	 */
	public net.sourceforge.lept4j.Ptaa.ByReference ptaa;
	/**
	 * centroids of averaged bitmaps<br>
	 * C type : Pta*
	 */
	public net.sourceforge.lept4j.Pta.ByReference pta;
	/**
	 * area of all bitmap examples<br>
	 * C type : Numaa*
	 */
	public net.sourceforge.lept4j.Numaa.ByReference naasum;
	/**
	 * area of averaged bitmaps<br>
	 * C type : Numa*
	 */
	public net.sourceforge.lept4j.Numa.ByReference nasum;
	/**
	 * input training images<br>
	 * C type : Pixa*
	 */
	public net.sourceforge.lept4j.Pixa.ByReference pixa_tr;
	/**
	 * unscaled and scaled averaged bitmaps<br>
	 * C type : Pixa*
	 */
	public net.sourceforge.lept4j.Pixa.ByReference pixadb_ave;
	/**
	 * input images for identifying<br>
	 * C type : Pixa*
	 */
	public net.sourceforge.lept4j.Pixa.ByReference pixa_id;
	/**
	 * debug: best match of input against ave.<br>
	 * C type : Pix*
	 */
	public net.sourceforge.lept4j.Pix.ByReference pixdb_ave;
	/**
	 * debug: best matches within range<br>
	 * C type : Pix*
	 */
	public net.sourceforge.lept4j.Pix.ByReference pixdb_range;
	/**
	 * debug: bootstrap training results<br>
	 * C type : Pixa*
	 */
	public net.sourceforge.lept4j.Pixa.ByReference pixadb_boot;
	/**
	 * debug: splitting results<br>
	 * C type : Pixa*
	 */
	public net.sourceforge.lept4j.Pixa.ByReference pixadb_split;
	/**
	 * bmf fonts<br>
	 * C type : L_Bmf*
	 */
	public net.sourceforge.lept4j.L_Bmf.ByReference bmf;
	/**
	 * font size of bmf; default is 6 pt<br>
	 * C type : l_int32
	 */
	public int bmf_size;
	/**
	 * temp data used for image decoding<br>
	 * C type : L_Rdid*
	 */
	public net.sourceforge.lept4j.L_Rdid.ByReference did;
	/**
	 * temp data used for holding best char<br>
	 * C type : L_Rch*
	 */
	public net.sourceforge.lept4j.L_Rch.ByReference rch;
	/**
	 * temp data used for array of best chars<br>
	 * C type : L_Rcha*
	 */
	public net.sourceforge.lept4j.L_Rcha.ByReference rcha;
	/**
	 * 1 if using bootstrap samples; else 0<br>
	 * C type : l_int32
	 */
	public int bootrecog;
	/**
	 * recog index in recoga; -1 if no parent<br>
	 * C type : l_int32
	 */
	public int index;
	/**
	 * ptr to parent array; can be null<br>
	 * C type : L_Recoga*
	 */
	public net.sourceforge.lept4j.L_Recoga.ByReference parent;
	public L_Recog() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("scalew", "scaleh", "templ_type", "maxarraysize", "setsize", "threshold", "maxyshift", "asperity_fr", "charset_type", "charset_size", "bootdir", "bootpattern", "bootpath", "boot_iters", "min_nopad", "max_afterpad", "min_samples", "num_samples", "minwidth_u", "maxwidth_u", "minheight_u", "maxheight_u", "minwidth", "maxwidth", "ave_done", "train_done", "min_splitw", "min_splith", "max_splith", "sa_text", "dna_tochar", "centtab", "sumtab", "pixaa_u", "pixa_u", "ptaa_u", "pta_u", "naasum_u", "nasum_u", "pixaa", "pixa", "ptaa", "pta", "naasum", "nasum", "pixa_tr", "pixadb_ave", "pixa_id", "pixdb_ave", "pixdb_range", "pixadb_boot", "pixadb_split", "bmf", "bmf_size", "did", "rch", "rcha", "bootrecog", "index", "parent");
	}
	public L_Recog(Pointer peer) {
		super(peer);
		read();
	}
	public static class ByReference extends L_Recog implements Structure.ByReference {
		
	};
	public static class ByValue extends L_Recog implements Structure.ByValue {
		
	};
}
