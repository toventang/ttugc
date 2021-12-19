package com.google.android.play.core.p1963b;

import com.bytedance.covode.number.Covode;
import java.math.BigInteger;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Set;

/* renamed from: com.google.android.play.core.b.bp */
class C26925bp extends X509Certificate {

    /* renamed from: a */
    private final X509Certificate f63814a;

    static {
        Covode.recordClassIndex(32400);
    }

    public C26925bp(X509Certificate x509Certificate) {
        this.f63814a = x509Certificate;
    }

    @Override // java.security.cert.X509Certificate
    public final void checkValidity() {
        this.f63814a.checkValidity();
    }

    @Override // java.security.cert.X509Certificate
    public final void checkValidity(Date date) {
        this.f63814a.checkValidity(date);
    }

    public final int getBasicConstraints() {
        return this.f63814a.getBasicConstraints();
    }

    @Override // java.security.cert.X509Extension
    public final Set<String> getCriticalExtensionOIDs() {
        return this.f63814a.getCriticalExtensionOIDs();
    }

    @Override // java.security.cert.Certificate
    public byte[] getEncoded() {
        return this.f63814a.getEncoded();
    }

    public final byte[] getExtensionValue(String str) {
        return this.f63814a.getExtensionValue(str);
    }

    public final Principal getIssuerDN() {
        return this.f63814a.getIssuerDN();
    }

    public final boolean[] getIssuerUniqueID() {
        return this.f63814a.getIssuerUniqueID();
    }

    public final boolean[] getKeyUsage() {
        return this.f63814a.getKeyUsage();
    }

    @Override // java.security.cert.X509Extension
    public final Set<String> getNonCriticalExtensionOIDs() {
        return this.f63814a.getNonCriticalExtensionOIDs();
    }

    public final Date getNotAfter() {
        return this.f63814a.getNotAfter();
    }

    public final Date getNotBefore() {
        return this.f63814a.getNotBefore();
    }

    public final PublicKey getPublicKey() {
        return this.f63814a.getPublicKey();
    }

    public final BigInteger getSerialNumber() {
        return this.f63814a.getSerialNumber();
    }

    public final String getSigAlgName() {
        return this.f63814a.getSigAlgName();
    }

    public final String getSigAlgOID() {
        return this.f63814a.getSigAlgOID();
    }

    public final byte[] getSigAlgParams() {
        return this.f63814a.getSigAlgParams();
    }

    public final byte[] getSignature() {
        return this.f63814a.getSignature();
    }

    public final Principal getSubjectDN() {
        return this.f63814a.getSubjectDN();
    }

    public final boolean[] getSubjectUniqueID() {
        return this.f63814a.getSubjectUniqueID();
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getTBSCertificate() {
        return this.f63814a.getTBSCertificate();
    }

    public final int getVersion() {
        return this.f63814a.getVersion();
    }

    public final boolean hasUnsupportedCriticalExtension() {
        return this.f63814a.hasUnsupportedCriticalExtension();
    }

    public final String toString() {
        return this.f63814a.toString();
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey) {
        this.f63814a.verify(publicKey);
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey, String str) {
        this.f63814a.verify(publicKey, str);
    }
}
