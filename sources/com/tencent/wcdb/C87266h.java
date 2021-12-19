package com.tencent.wcdb;

import com.bytedance.covode.number.Covode;
import com.tencent.wcdb.database.C87260m;
import com.tencent.wcdb.database.SQLiteDatabase;

/* renamed from: com.tencent.wcdb.h */
public final class C87266h {

    /* renamed from: a */
    private static final char[] f197764a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    static {
        Covode.recordClassIndex(103155);
    }

    /* renamed from: a */
    public static int m151443a(String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (strArr[i].equals("_id")) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static String m151445a(String str) {
        StringBuilder sb = new StringBuilder();
        m151446a(sb, str);
        return sb.toString();
    }

    /* renamed from: b */
    public static int m151447b(String str) {
        String trim = str.trim();
        if (trim.length() < 3) {
            return 99;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            int charAt = trim.charAt(i);
            if (charAt < 97 || charAt > 122) {
                if (charAt >= 128) {
                    break;
                }
            } else {
                charAt = (charAt - 97) + 65;
            }
            i2 |= (charAt & 127) << (i * 8);
            i++;
            if (i >= 3) {
                switch (i2) {
                    case 4279873:
                    case 5522756:
                        return 9;
                    case 4280912:
                        return 7;
                    case 4476485:
                    case 5066563:
                        return 5;
                    case 4477013:
                    case 4998468:
                    case 5260626:
                    case 5459529:
                        return 2;
                    case 4543043:
                    case 5198404:
                    case 5524545:
                        return 8;
                    case 4670786:
                        return 4;
                    case 4998483:
                        return 1;
                    case 5001042:
                        return 6;
                    case 5526593:
                        return 3;
                }
            }
        }
        return 99;
    }

    /* renamed from: a */
    public static int m151442a(int i, int i2) {
        return Math.max(i - (i2 / 3), 0);
    }

    /* renamed from: b */
    public static String m151448b(SQLiteDatabase sQLiteDatabase, String str) {
        C87260m a = sQLiteDatabase.mo141200a(str);
        try {
            return a.mo141268j();
        } finally {
            a.close();
        }
    }

    /* renamed from: a */
    public static long m151444a(SQLiteDatabase sQLiteDatabase, String str) {
        C87260m a = sQLiteDatabase.mo141200a(str);
        try {
            return a.mo141267i();
        } finally {
            a.close();
        }
    }

    /* renamed from: a */
    private static void m151446a(StringBuilder sb, String str) {
        sb.append('\'');
        if (str.indexOf(39) != -1) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt == '\'') {
                    sb.append('\'');
                }
                sb.append(charAt);
            }
        } else {
            sb.append(str);
        }
        sb.append('\'');
    }
}
