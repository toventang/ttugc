package com.appsflyer.internal;

import android.util.Pair;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.Method;

/* renamed from: com.appsflyer.internal.d */
public class C2318d {

    /* renamed from: ŀ */
    public static byte[] f7043;

    /* renamed from: ł */
    private static Object f7044;

    /* renamed from: ſ */
    private static int f7045;

    /* renamed from: Ɨ */
    private static int f7046 = -3;

    /* renamed from: ƚ */
    private static final byte[] f7047 = null;

    /* renamed from: ɍ */
    private static long f7048 = -4563979436785797051L;

    /* renamed from: ɔ */
    private static int f7049;

    /* renamed from: ɿ */
    private static Object f7050;

    /* renamed from: ʅ */
    private static int f7051;

    /* renamed from: г */
    public static byte[] f7052;

    private static void $$a() {
        int i;
        int i2 = f7049;
        int i3 = (i2 & 9) + (i2 | 9);
        f7051 = i3 % 128;
        if ((i3 % 2 == 0 ? '.' : 'W') != 'W') {
            byte[] bArr = new byte[912];
            System.arraycopy("'ÌÍú\u0018îÐ>\tÂ\u00176ô\u0003\u0002\u0010ö\u0002è(\u0005\b\u0002â$\u0001öÿ\u000f\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010¿>\b\tô\u0010ÿö\u000eÅ:Â\u0003ú\u0018îÐAø\u0010üÊ()ý\u0004ô\u000b\u0015\u0000\u0003ö\f\tÐ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002ú\u0018îÐCþ\tÂ\u0017:þôà6ô\u0003\u0002\u0010\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ8ÃK\u0010ù\u0011\u0000ýþÍD\u0007¾\u00176÷\u0006ûÃ5ò\u0010\u0004ù\t\u0002ú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÓ(\u0005\b\u0002â$\u0001öÿ\u000f\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u001e(â\u001b\u000b\u0005\u0006\nÎ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010öÿ\u0006å2ú\u0003\u0010\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ9Â\u0003\u0001\u0012Õ&\u0006ü\u0011Ô(\fþú\u000eô\u0001\u0012Ò!\u0005\b\u0000â(\föÿ\u0006\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0019$\u0016Ñ&\u0006ü\u000fø\u0004ý\u0007\u0001\u0005\b\u0000\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0017\"\u0015õâ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010\u0001\u0012Ò/ø\u0004á!\u0005\b\u0000â(\f\tøøî\nì\u000bI\u0004´Iþ\u000e\u0003ù\u0002\u0005\u000b\u000b°Oü\u0004\u0011¸î\tí\u000bî\u0007ï\u000bî\u000bë\u000bú\u0018îÐAø\u0010üÊ\u0018,ø\u0015\u0003Ü&õ\u0006\u0004\u0010\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u00162\u0003Ú(\u0006ö\u0002\u000e\n\u0001\u0012Ô6ÿô\u0010ÿö\u000eê$þ\u0006ò\t\u0001â(\fö\u0001\u0014þ\u0006\n7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ6Îú\u0018îÐ>\tÂ\u0019 \u0016ðë(\u0005\b\u0002â$\u0001öÿ\u000f\u0006õ\u0006ã$\u0016ú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÙ)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\u0010ù\u0011\u0000ýþÍD\u0007¾\u001a,\u000bö\f\u0000\u0002\u0002û\f\tû\u0001\n\u0001\u0012Ò,ø\u0015\u0003Ü&õ\u0006\u0004\u00108\u0000\u0016ðÑ8\u0000\u0016ðÑ\u0004\nü\u0012ô\u0001\u0012Õ\u0001ô\n\u0017í\b\tö\u0016ø\u0010òê ü\u0013ò\u0014\nÚ\u0014\u0016÷à*ü\u000bû\f\t\u0002\f\u0006\u0007õ7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ5Ïú\u0018îÐ>\tÂIü\u0006÷\b\f\u0001\u0012ß%\u0000\u0004ø\u0010\u0005\b\u0001\u0012Ð$\u0014ÿ\u0000\f\u0002ôî\u0014\u0016÷\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u0016%\u0014ø\u0010ö\u000e\bÞ\u0017\röÿ\u0006ú\u0018îÐ>\tÂ\u001b&\u0006üí)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\u0001\u0010ì\u001eú\u000eôú\u0018îÐ>\tÂ\u001e\tù6î\u0005\u000e\u0007ø\t\u0002ô\u0016÷ç \r\u0004\u0001\u0012Ø(þ\u000eøû\u000eØ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002ú\u0018îÐ>\tÂ\u001b&\u0006üî\u0006ð\u000b\u0015\u0000\u0003ö\f\tã\u0018\u0007ûë\u001f\u0006\u0003\u0000\rú\u0018îÐ>\tÂ\u001b&\u0006üâ$\u0011ó\u0012ú\n\u0007þ\u0006þÖ:þôß4\u0003ò\u001b\u0006õ\u0006â,ø\u0015\u0003\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010þò\u0012ö\u0016ø\u0010òê ü\u0013ò\u0014\nÎ(\fö\u0001\u0014þ\u0006úÿ\u0011ú\u0018îÐ>\tÂ\u001e(\u0005\b\u0002â$\u0001öÿ\u000f".getBytes("ISO-8859-1"), 0, bArr, 0, 912);
            f7047 = bArr;
            i = 244;
        } else {
            byte[] bArr2 = new byte[912];
            System.arraycopy("'ÌÍú\u0018îÐ>\tÂ\u00176ô\u0003\u0002\u0010ö\u0002è(\u0005\b\u0002â$\u0001öÿ\u000f\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010¿>\b\tô\u0010ÿö\u000eÅ:Â\u0003ú\u0018îÐAø\u0010üÊ()ý\u0004ô\u000b\u0015\u0000\u0003ö\f\tÐ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002ú\u0018îÐCþ\tÂ\u0017:þôà6ô\u0003\u0002\u0010\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ8ÃK\u0010ù\u0011\u0000ýþÍD\u0007¾\u00176÷\u0006ûÃ5ò\u0010\u0004ù\t\u0002ú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÓ(\u0005\b\u0002â$\u0001öÿ\u000f\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u001e(â\u001b\u000b\u0005\u0006\nÎ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010öÿ\u0006å2ú\u0003\u0010\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ9Â\u0003\u0001\u0012Õ&\u0006ü\u0011Ô(\fþú\u000eô\u0001\u0012Ò!\u0005\b\u0000â(\föÿ\u0006\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0019$\u0016Ñ&\u0006ü\u000fø\u0004ý\u0007\u0001\u0005\b\u0000\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0017\"\u0015õâ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010\u0001\u0012Ò/ø\u0004á!\u0005\b\u0000â(\f\tøøî\nì\u000bI\u0004´Iþ\u000e\u0003ù\u0002\u0005\u000b\u000b°Oü\u0004\u0011¸î\tí\u000bî\u0007ï\u000bî\u000bë\u000bú\u0018îÐAø\u0010üÊ\u0018,ø\u0015\u0003Ü&õ\u0006\u0004\u0010\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u00162\u0003Ú(\u0006ö\u0002\u000e\n\u0001\u0012Ô6ÿô\u0010ÿö\u000eê$þ\u0006ò\t\u0001â(\fö\u0001\u0014þ\u0006\n7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ6Îú\u0018îÐ>\tÂ\u0019 \u0016ðë(\u0005\b\u0002â$\u0001öÿ\u000f\u0006õ\u0006ã$\u0016ú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÙ)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\u0010ù\u0011\u0000ýþÍD\u0007¾\u001a,\u000bö\f\u0000\u0002\u0002û\f\tû\u0001\n\u0001\u0012Ò,ø\u0015\u0003Ü&õ\u0006\u0004\u00108\u0000\u0016ðÑ8\u0000\u0016ðÑ\u0004\nü\u0012ô\u0001\u0012Õ\u0001ô\n\u0017í\b\tö\u0016ø\u0010òê ü\u0013ò\u0014\nÚ\u0014\u0016÷à*ü\u000bû\f\t\u0002\f\u0006\u0007õ7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ5Ïú\u0018îÐ>\tÂIü\u0006÷\b\f\u0001\u0012ß%\u0000\u0004ø\u0010\u0005\b\u0001\u0012Ð$\u0014ÿ\u0000\f\u0002ôî\u0014\u0016÷\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u0016%\u0014ø\u0010ö\u000e\bÞ\u0017\röÿ\u0006ú\u0018îÐ>\tÂ\u001b&\u0006üí)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\u0001\u0010ì\u001eú\u000eôú\u0018îÐ>\tÂ\u001e\tù6î\u0005\u000e\u0007ø\t\u0002ô\u0016÷ç \r\u0004\u0001\u0012Ø(þ\u000eøû\u000eØ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002ú\u0018îÐ>\tÂ\u001b&\u0006üî\u0006ð\u000b\u0015\u0000\u0003ö\f\tã\u0018\u0007ûë\u001f\u0006\u0003\u0000\rú\u0018îÐ>\tÂ\u001b&\u0006üâ$\u0011ó\u0012ú\n\u0007þ\u0006þÖ:þôß4\u0003ò\u001b\u0006õ\u0006â,ø\u0015\u0003\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010þò\u0012ö\u0016ø\u0010òê ü\u0013ò\u0014\nÎ(\fö\u0001\u0014þ\u0006úÿ\u0011ú\u0018îÐ>\tÂ\u001e(\u0005\b\u0002â$\u0001öÿ\u000f".getBytes("ISO-8859-1"), 0, bArr2, 0, 912);
            f7047 = bArr2;
            i = 7812;
        }
        f7045 = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x006a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String $$c(short r11, short r12, short r13) {
        /*
        // Method dump skipped, instructions count: 138
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C2318d.$$c(short, short, short):java.lang.String");
    }

    private static Object com_appsflyer_internal_d_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_appsflyer_internal_d_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_appsflyer_internal_d_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    /* renamed from: ǃ */
    public static Object m7119(int i, char c, int i2) {
        int i3 = f7051;
        int i4 = ((i3 | 45) << 1) - (i3 ^ 45);
        int i5 = i4 % 128;
        f7049 = i5;
        if (i4 % 2 != 0) {
        }
        Object obj = f7050;
        int i6 = i5 + 13;
        f7051 = i6 % 128;
        int i7 = i6 % 2;
        try {
            Object[] objArr = new Object[3];
            objArr[2] = Integer.valueOf(i2);
            objArr[1] = Character.valueOf(c);
            objArr[0] = Integer.valueOf(i);
            byte[] bArr = f7047;
            Class<?> cls = Class.forName($$c((short) bArr[544], (byte) bArr[288], 854), true, (ClassLoader) f7044);
            byte b = (byte) bArr[71];
            Object com_appsflyer_internal_d_java_lang_reflect_Method_invoke = com_appsflyer_internal_d_java_lang_reflect_Method_invoke(cls.getMethod($$c(374, b, (short) (b | 648)), Integer.TYPE, Character.TYPE, Integer.TYPE), obj, objArr);
            int i8 = f7051 + 49;
            f7049 = i8 % 128;
            int i9 = i8 % 2;
            return com_appsflyer_internal_d_java_lang_reflect_Method_invoke;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: ɩ */
    public static int m7120(int i) {
        int i2 = f7051;
        int i3 = (i2 + 28) - 1;
        f7049 = i3 % 128;
        int i4 = i3 % 2;
        Object obj = f7050;
        int i5 = ((i2 | 101) << 1) - (i2 ^ 101);
        f7049 = i5 % 128;
        int i6 = i5 % 2;
        try {
            Object[] objArr = {Integer.valueOf(i)};
            byte[] bArr = f7047;
            Class<?> cls = Class.forName($$c((short) bArr[544], (byte) bArr[288], 854), true, (ClassLoader) f7044);
            byte b = (byte) bArr[71];
            int intValue = ((Integer) com_appsflyer_internal_d_java_lang_reflect_Method_invoke(cls.getMethod($$c(730, b, (short) (b | 336)), Integer.TYPE), obj, objArr)).intValue();
            int i7 = f7049 + 67;
            f7051 = i7 % 128;
            int i8 = i7 % 2;
            return intValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: ɩ */
    public static int m7121(Object obj) {
        int i = f7049;
        int i2 = (i ^ 7) + ((i & 7) << 1);
        f7051 = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj2 = f7050;
            int i3 = f7051;
            int i4 = ((i3 & 121) + (i3 | 121)) % 128;
            f7049 = i4;
            int i5 = (i4 + 76) - 1;
            f7051 = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object[] objArr = {obj};
                byte[] bArr = f7047;
                Class<?> cls = Class.forName($$c((short) bArr[544], (byte) bArr[288], 854), true, (ClassLoader) f7044);
                byte b = (byte) bArr[71];
                return ((Integer) com_appsflyer_internal_d_java_lang_reflect_Method_invoke(cls.getMethod($$c(382, b, (short) b), Object.class), obj2, objArr)).intValue();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } else {
            Object obj3 = f7050;
            throw new NullPointerException("hashCode");
        }
    }

    private C2318d() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0095, code lost:
        if (r6 != null) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009b, code lost:
        if (r6 == null) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009e, code lost:
        if (r6 != null) goto L_0x0158;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:346:0x0be3 */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x03aa  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x03b5  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0660 A[Catch:{ all -> 0x0752 }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0663 A[Catch:{ all -> 0x0752 }] */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0722  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0726  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x092b  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x098f  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x0a39 A[Catch:{ all -> 0x15e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:379:0x0d6d A[SYNTHETIC, Splitter:B:379:0x0d6d] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x010c A[SYNTHETIC, Splitter:B:40:0x010c] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0125 A[Catch:{ Exception -> 0x009a }] */
    /* JADX WARNING: Removed duplicated region for block: B:432:0x1059  */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x10e0 A[Catch:{ all -> 0x13c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:450:0x1119  */
    /* JADX WARNING: Removed duplicated region for block: B:470:0x122c A[Catch:{ all -> 0x1300 }, DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:472:0x1230 A[Catch:{ all -> 0x1300 }] */
    /* JADX WARNING: Removed duplicated region for block: B:549:0x1375  */
    /* JADX WARNING: Removed duplicated region for block: B:551:0x1379  */
    /* JADX WARNING: Removed duplicated region for block: B:661:0x14b2  */
    /* JADX WARNING: Removed duplicated region for block: B:663:0x14b6  */
    /* JADX WARNING: Removed duplicated region for block: B:700:0x15c6  */
    /* JADX WARNING: Removed duplicated region for block: B:702:0x15ca  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:724:0x1611  */
    /* JADX WARNING: Removed duplicated region for block: B:726:0x1615  */
    /* JADX WARNING: Removed duplicated region for block: B:764:0x1688  */
    /* JADX WARNING: Removed duplicated region for block: B:768:0x1698  */
    /* JADX WARNING: Removed duplicated region for block: B:771:0x16b2  */
    /* JADX WARNING: Removed duplicated region for block: B:812:0x16b8 A[EDGE_INSN: B:812:0x16b8->B:773:0x16b8 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:815:0x13c7 A[EDGE_INSN: B:815:0x13c7->B:584:0x13c7 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0366 A[Catch:{ ClassNotFoundException -> 0x03ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0368  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x037d  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x037f  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0393  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0395  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x039e  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x03a8  */
    static {
        /*
        // Method dump skipped, instructions count: 5970
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C2318d.<clinit>():void");
    }
}
