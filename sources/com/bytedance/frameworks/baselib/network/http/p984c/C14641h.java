package com.bytedance.frameworks.baselib.network.http.p984c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* renamed from: com.bytedance.frameworks.baselib.network.http.c.h */
public class C14641h implements Serializable {

    /* renamed from: a */
    private static final String f35460a = C14641h.class.getSimpleName();
    private static final long serialVersionUID = 6374381323722046732L;

    /* renamed from: b */
    private transient C14633e f35461b;

    /* renamed from: c */
    private long f35462c = System.currentTimeMillis();

    /* renamed from: com_bytedance_frameworks_baselib_network_http_impl_SerializableHttpCookie_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m26770xb4b0271b(String str, String str2, Throwable th) {
        return 0;
    }

    public C14633e getHttpCookie() {
        return this.f35461b;
    }

    public Long getWhenCreated() {
        return Long.valueOf(this.f35462c);
    }

    public int hashCode() {
        return this.f35461b.hashCode();
    }

    static {
        Covode.recordClassIndex(16732);
    }

    public boolean hasExpired() {
        long j = this.f35461b.f35431e;
        if (j != -1 && (System.currentTimeMillis() - this.f35462c) / 1000 > j) {
            return true;
        }
        return false;
    }

    public String encode() {
        MethodCollector.m26663i(10531);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new ObjectOutputStream(byteArrayOutputStream).writeObject(this);
            String a = m26769a(byteArrayOutputStream.toByteArray());
            MethodCollector.m26664o(10531);
            return a;
        } catch (IOException e) {
            m26770xb4b0271b(f35460a, "IOException in encodeCookie", e);
            MethodCollector.m26664o(10531);
            return null;
        }
    }

    public C14641h(C14633e eVar) {
        this.f35461b = eVar;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C14633e) {
            return this.f35461b.equals(obj);
        }
        if (obj instanceof C14641h) {
            return this.f35461b.equals(((C14641h) obj).f35461b);
        }
        return false;
    }

    /* renamed from: a */
    private static String m26769a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i = b & 255;
            if (i < 16) {
                sb.append('0');
            }
            sb.append(Integer.toHexString(i));
        }
        return sb.toString();
    }

    public static C14641h decode(String str) {
        MethodCollector.m26663i(10693);
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        try {
            C14641h hVar = (C14641h) new ObjectInputStream(new ByteArrayInputStream(bArr)).readObject();
            MethodCollector.m26664o(10693);
            return hVar;
        } catch (IOException e) {
            m26770xb4b0271b(f35460a, "IOException in decodeCookie", e);
            MethodCollector.m26664o(10693);
            return null;
        } catch (ClassNotFoundException e2) {
            m26770xb4b0271b(f35460a, "ClassNotFoundException in decodeCookie", e2);
            MethodCollector.m26664o(10693);
            return null;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(this.f35461b.f35432f);
        objectOutputStream.writeObject(this.f35461b.f35437k);
        objectOutputStream.writeObject(this.f35461b.f35427a);
        objectOutputStream.writeObject(this.f35461b.f35428b);
        objectOutputStream.writeObject(this.f35461b.f35430d);
        objectOutputStream.writeLong(this.f35461b.f35431e);
        objectOutputStream.writeObject(this.f35461b.f35433g);
        objectOutputStream.writeObject(this.f35461b.f35434h);
        objectOutputStream.writeInt(this.f35461b.f35438l);
        objectOutputStream.writeBoolean(this.f35461b.f35435i);
        objectOutputStream.writeBoolean(this.f35461b.f35429c);
        objectOutputStream.writeBoolean(this.f35461b.f35436j);
        objectOutputStream.writeLong(this.f35462c);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        C14633e eVar = new C14633e((String) objectInputStream.readObject(), (String) objectInputStream.readObject());
        this.f35461b = eVar;
        eVar.f35427a = (String) objectInputStream.readObject();
        this.f35461b.f35428b = (String) objectInputStream.readObject();
        this.f35461b.mo23507a((String) objectInputStream.readObject());
        this.f35461b.f35431e = objectInputStream.readLong();
        this.f35461b.f35433g = (String) objectInputStream.readObject();
        this.f35461b.f35434h = (String) objectInputStream.readObject();
        C14633e eVar2 = this.f35461b;
        int readInt = objectInputStream.readInt();
        if (readInt == 0 || readInt == 1) {
            eVar2.f35438l = readInt;
            this.f35461b.f35435i = objectInputStream.readBoolean();
            this.f35461b.f35429c = objectInputStream.readBoolean();
            this.f35461b.f35436j = objectInputStream.readBoolean();
            this.f35462c = objectInputStream.readLong();
            return;
        }
        throw new IllegalArgumentException("Bad version: ".concat(String.valueOf(readInt)));
    }

    public static int getEffectivePort(String str, int i) {
        if (i != -1) {
            return i;
        }
        if ("http".equalsIgnoreCase(str)) {
            return 80;
        }
        if ("https".equalsIgnoreCase(str)) {
            return 443;
        }
        return -1;
    }
}
