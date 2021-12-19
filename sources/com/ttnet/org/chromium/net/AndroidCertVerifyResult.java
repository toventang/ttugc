package com.ttnet.org.chromium.net;

import com.bytedance.covode.number.Covode;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AndroidCertVerifyResult {

    /* renamed from: a */
    private final int f198478a;

    /* renamed from: b */
    private final boolean f198479b;

    /* renamed from: c */
    private final List<X509Certificate> f198480c;

    static {
        Covode.recordClassIndex(103446);
    }

    public int getStatus() {
        return this.f198478a;
    }

    public boolean isIssuedByKnownRoot() {
        return this.f198479b;
    }

    public byte[][] getCertificateChainEncoded() {
        byte[][] bArr = new byte[this.f198480c.size()][];
        for (int i = 0; i < this.f198480c.size(); i++) {
            try {
                bArr[i] = this.f198480c.get(i).getEncoded();
            } catch (CertificateEncodingException unused) {
                return new byte[0][];
            }
        }
        return bArr;
    }

    public AndroidCertVerifyResult(int i) {
        this.f198478a = i;
        this.f198480c = Collections.emptyList();
    }

    public AndroidCertVerifyResult(boolean z, List<X509Certificate> list) {
        this.f198478a = 0;
        this.f198479b = z;
        this.f198480c = new ArrayList(list);
    }
}
