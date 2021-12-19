package com.p2082ss.android.ugc.aweme.p2363ba;

import android.text.InputFilter;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.shortvideo.view.MentionEditText;

/* renamed from: com.ss.android.ugc.aweme.ba.b */
public final class C34410b implements InputFilter {

    /* renamed from: a */
    public boolean f81330a;

    /* renamed from: b */
    private final int f81331b;

    /* renamed from: c */
    private MentionEditText f81332c;

    /* renamed from: d */
    private final int f81333d = 5000;

    static {
        Covode.recordClassIndex(41354);
    }

    /* renamed from: a */
    private static boolean m70400a() {
        return C63253l.f143623a.mo73309e().mo93762d();
    }

    /* renamed from: a */
    private static int m70399a(String str) {
        return str.replace("\n", "").length();
    }

    public C34410b(int i, MentionEditText mentionEditText) {
        this.f81331b = i;
        this.f81332c = mentionEditText;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01f9, code lost:
        r2 = com.p2082ss.android.ugc.aweme.port.p3561in.C63247i.f143610a.getResources().getString(com.p2082ss.android.ugc.trill.R.string.eqp, java.lang.Integer.valueOf(r9.f81331b));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x020e, code lost:
        new com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a(com.p2082ss.android.ugc.aweme.port.p3561in.C63247i.f143610a).mo123052a(r2).mo123053a();
        r9.f81330a = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0222, code lost:
        return r10.subSequence(r11, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0047, code lost:
        if (r10 != null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004d, code lost:
        if (r10.length() == 0) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
        if (r11 != r12) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
        if (r9.f81332c.f166477s == false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005b, code lost:
        return r13.subSequence(r14, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0061, code lost:
        if (m70400a() == false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006d, code lost:
        if (r10.toString().endsWith("\n") == false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006f, code lost:
        r9.f81332c.setAddVideoChain(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0074, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0075, code lost:
        r1 = (com.p2082ss.android.ugc.aweme.shortvideo.view.MentionEditText.AdSpan[]) r13.getSpans(0, r13.length(), com.p2082ss.android.ugc.aweme.shortvideo.view.MentionEditText.AdSpan.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008b, code lost:
        if (android.text.TextUtils.isEmpty(r9.f81332c.getAdTag()) == false) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0091, code lost:
        if (m70400a() == false) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0093, code lost:
        r0 = m70399a(r13.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009b, code lost:
        r4 = ((r9.f81331b - r0) + r15) - r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a4, code lost:
        if (r9.f81332c.f166477s == false) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a6, code lost:
        r4 = 5000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00af, code lost:
        if (r4 > 0) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b5, code lost:
        if (android.text.TextUtils.isEmpty(r10) != false) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00bd, code lost:
        if (com.p2082ss.android.ugc.aweme.port.p3561in.C63238c.f143594u.mo93901a() != false) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c3, code lost:
        if (com.p2082ss.android.ugc.aweme.shortvideo.p3838k.C71913g.m126988a() == false) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c5, code lost:
        r2 = com.p2082ss.android.ugc.aweme.port.p3561in.C63247i.f143610a.getResources().getString(com.p2082ss.android.ugc.trill.R.string.fin, java.lang.Integer.valueOf(r9.f81331b));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d9, code lost:
        new com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a(com.p2082ss.android.ugc.aweme.port.p3561in.C63247i.f143610a).mo123052a(r2).mo123053a();
        r9.f81330a = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ed, code lost:
        if (r9.f81332c.f166482x == false) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ef, code lost:
        r9.f81332c.setRepasteUrlSuccess(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f4, code lost:
        r9.f81332c.setAddVideoChain(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f9, code lost:
        return "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00fa, code lost:
        r2 = com.p2082ss.android.ugc.aweme.port.p3561in.C63247i.f143610a.getResources().getString(com.p2082ss.android.ugc.trill.R.string.eqp, java.lang.Integer.valueOf(r9.f81331b));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x010f, code lost:
        r0 = r13.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0115, code lost:
        if (r1.length != 0) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0117, code lost:
        r9.f81332c.setAddVideoChain(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x011c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0121, code lost:
        if (m70400a() == false) goto L_0x012f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0123, code lost:
        r0 = m70399a(r9.f81332c.getNoAdTagText());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x012f, code lost:
        r0 = r9.f81332c.getNoAdTagText().length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x013c, code lost:
        if (r4 < (r12 - r11)) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0142, code lost:
        if (r9.f81332c.f166481w == false) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0144, code lost:
        r9.f81332c.setAddChainSuccess(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x014d, code lost:
        if (r9.f81332c.f166482x == false) goto L_0x0154;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x014f, code lost:
        r9.f81332c.setRepasteUrlSuccess(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0154, code lost:
        r9.f81332c.setAddVideoChain(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0159, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x015e, code lost:
        if (r9.f81332c.f166481w == false) goto L_0x01aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0160, code lost:
        r9.f81332c.setAddVideoChain(false);
        r2 = (android.text.Editable) r10;
        r1 = (com.p2082ss.android.ugc.aweme.shortvideo.view.MentionEditText.MentionSpan[]) r2.getSpans(0, r2.length(), com.p2082ss.android.ugc.aweme.shortvideo.view.MentionEditText.MentionSpan.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0174, code lost:
        if (r1 == null) goto L_0x017e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0177, code lost:
        if (r1.length <= 0) goto L_0x017e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0179, code lost:
        r2.removeSpan(r1[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x017e, code lost:
        r1 = (com.p2082ss.android.ugc.aweme.shortvideo.p3788aa.C69753a[]) r2.getSpans(0, r2.length(), com.p2082ss.android.ugc.aweme.shortvideo.p3788aa.C69753a.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x018a, code lost:
        if (r1 == null) goto L_0x0194;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x018d, code lost:
        if (r1.length <= 0) goto L_0x0194;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x018f, code lost:
        r2.removeSpan(r1[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0194, code lost:
        r1 = (android.text.style.StyleSpan[]) r2.getSpans(0, r2.length(), android.text.style.StyleSpan.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01a0, code lost:
        if (r1 == null) goto L_0x01aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01a3, code lost:
        if (r1.length <= 0) goto L_0x01aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01a5, code lost:
        r2.removeSpan(r1[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01ae, code lost:
        if (r9.f81332c.f166482x == false) goto L_0x01b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01b0, code lost:
        r9.f81332c.setRepasteUrlSuccess(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01b5, code lost:
        r4 = r4 + r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01bc, code lost:
        if (com.p2082ss.android.ugc.aweme.port.p3561in.C63238c.f143594u.mo93901a() != false) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01c2, code lost:
        if (com.p2082ss.android.ugc.aweme.shortvideo.p3838k.C71913g.m126988a() == false) goto L_0x01f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01c4, code lost:
        r2 = com.p2082ss.android.ugc.aweme.port.p3561in.C63247i.f143610a.getResources().getString(com.p2082ss.android.ugc.trill.R.string.fin, java.lang.Integer.valueOf(r9.f81331b));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01e2, code lost:
        if (java.lang.Character.isHighSurrogate(r10.charAt(r4 - 1)) == false) goto L_0x020e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01e4, code lost:
        r4 = r4 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01e6, code lost:
        if (r4 != r11) goto L_0x020e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01e8, code lost:
        new com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a(com.p2082ss.android.ugc.aweme.port.p3561in.C63247i.f143610a).mo123052a(r2).mo123053a();
        r9.f81330a = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01f8, code lost:
        return "";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence filter(java.lang.CharSequence r10, int r11, int r12, android.text.Spanned r13, int r14, int r15) {
        /*
        // Method dump skipped, instructions count: 547
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2363ba.C34410b.filter(java.lang.CharSequence, int, int, android.text.Spanned, int, int):java.lang.CharSequence");
    }
}
