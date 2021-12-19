package com.bytedance.frameworks.baselib.network.http.p993e;

import com.bytedance.covode.number.Covode;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Locale;

/* renamed from: com.bytedance.frameworks.baselib.network.http.e.a */
public class C14743a implements Externalizable {

    /* renamed from: a */
    private String f35929a;

    /* renamed from: b */
    private String f35930b;

    /* renamed from: c */
    private C14744b f35931c;

    static {
        Covode.recordClassIndex(16840);
    }

    public C14744b getParameters() {
        return this.f35931c;
    }

    public String getPrimaryType() {
        return this.f35929a;
    }

    public String getSubType() {
        return this.f35930b;
    }

    public C14743a() {
        this.f35929a = "application";
        this.f35930b = "*";
        this.f35931c = new C14744b();
    }

    public String getBaseType() {
        return this.f35929a + "/" + this.f35930b;
    }

    public String toString() {
        return getBaseType() + this.f35931c.toString();
    }

    public C14743a(String str) {
        m27009a(str);
    }

    public boolean match(String str) {
        return match(new C14743a(str));
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeUTF(toString());
        objectOutput.flush();
    }

    /* renamed from: a */
    private static boolean m27010a(char c) {
        if (c <= ' ' || c >= 127 || "()<>@,;:/[]?=\\\"".indexOf(c) >= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m27011b(String str) {
        int length = str.length();
        if (length <= 0) {
            return false;
        }
        int i = 0;
        while (m27010a(str.charAt(i))) {
            i++;
            if (i >= length) {
                return true;
            }
        }
        return false;
    }

    public String getParameter(String str) {
        return (String) this.f35931c.f35932a.get(str.trim().toLowerCase(Locale.ENGLISH));
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        try {
            m27009a(objectInput.readUTF());
        } catch (C14745c e) {
            throw new IOException(e.toString());
        }
    }

    public void removeParameter(String str) {
        this.f35931c.f35932a.remove(str.trim().toLowerCase(Locale.ENGLISH));
    }

    public void setPrimaryType(String str) {
        if (m27011b(this.f35929a)) {
            this.f35929a = str.toLowerCase(Locale.ENGLISH);
            return;
        }
        throw new C14745c("Primary type is invalid.");
    }

    public void setSubType(String str) {
        if (m27011b(this.f35930b)) {
            this.f35930b = str.toLowerCase(Locale.ENGLISH);
            return;
        }
        throw new C14745c("Sub type is invalid.");
    }

    public boolean match(C14743a aVar) {
        if (!this.f35929a.equals(aVar.getPrimaryType())) {
            return false;
        }
        if (this.f35930b.equals("*") || aVar.getSubType().equals("*") || this.f35930b.equals(aVar.getSubType())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m27009a(String str) {
        int indexOf = str.indexOf(47);
        int indexOf2 = str.indexOf(59);
        if (indexOf >= 0) {
            if (indexOf >= 0 && indexOf2 < 0) {
                this.f35929a = str.substring(0, indexOf).trim().toLowerCase(Locale.ENGLISH);
                this.f35930b = str.substring(indexOf + 1).trim().toLowerCase(Locale.ENGLISH);
                this.f35931c = new C14744b();
            } else if (indexOf < indexOf2) {
                this.f35929a = str.substring(0, indexOf).trim().toLowerCase(Locale.ENGLISH);
                this.f35930b = str.substring(indexOf + 1, indexOf2).trim().toLowerCase(Locale.ENGLISH);
                this.f35931c = new C14744b(str.substring(indexOf2));
            } else {
                throw new C14745c("Unable to find a sub type.");
            }
            if (!m27011b(this.f35929a)) {
                throw new C14745c("Primary type is invalid.");
            } else if (!m27011b(this.f35930b)) {
                throw new C14745c("Sub type is invalid.");
            }
        } else if (indexOf2 >= 0) {
            throw new C14745c("Unable to find a sub type.");
        } else {
            throw new C14745c("Unable to find a sub type.");
        }
    }

    public void setParameter(String str, String str2) {
        this.f35931c.f35932a.put(str.trim().toLowerCase(Locale.ENGLISH), str2);
    }

    public C14743a(String str, String str2) {
        if (m27011b(str)) {
            this.f35929a = str.toLowerCase(Locale.ENGLISH);
            if (m27011b(str2)) {
                this.f35930b = str2.toLowerCase(Locale.ENGLISH);
                this.f35931c = new C14744b();
                return;
            }
            throw new C14745c("Sub type is invalid.");
        }
        throw new C14745c("Primary type is invalid.");
    }
}
