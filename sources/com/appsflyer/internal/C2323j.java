package com.appsflyer.internal;

import android.util.Base64;
import com.bytedance.covode.number.Covode;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.appsflyer.internal.j */
public final class C2323j {

    /* renamed from: ı */
    public String f7070;

    /* renamed from: ǃ */
    public String f7071;

    /* renamed from: ɩ */
    public String f7072;

    /* renamed from: ι */
    private byte[] f7073;

    static {
        Covode.recordClassIndex(2576);
    }

    C2323j() {
    }

    /* renamed from: ǃ */
    public final byte[] mo6466() {
        return this.f7073;
    }

    C2323j(char[] cArr) {
        byte[] decode;
        Scanner scanner = new Scanner(new String(cArr));
        int i = 0;
        int i2 = 0;
        while (scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();
            if (nextLine.startsWith("url=")) {
                this.f7070 = nextLine.substring(4).trim();
            } else if (nextLine.startsWith("version=")) {
                this.f7072 = nextLine.substring(8).trim();
                Matcher matcher = Pattern.compile("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$").matcher(this.f7072);
                if (matcher.matches()) {
                    i = Integer.parseInt(matcher.group(1));
                    i2 = Integer.parseInt(matcher.group(2));
                }
            } else if (nextLine.startsWith("data=")) {
                String trim = nextLine.substring(5).trim();
                if (i > 4 || i2 >= 11) {
                    decode = Base64.decode(trim, 2);
                } else {
                    decode = trim.getBytes();
                }
                this.f7073 = decode;
            }
        }
        scanner.close();
    }

    public C2323j(String str, byte[] bArr, String str2) {
        this.f7070 = str;
        this.f7073 = bArr;
        this.f7072 = str2;
    }
}
