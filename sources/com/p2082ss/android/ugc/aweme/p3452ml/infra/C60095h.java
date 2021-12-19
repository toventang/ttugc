package com.p2082ss.android.ugc.aweme.p3452ml.infra;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ml.infra.h */
public final class C60095h {

    /* renamed from: a */
    public Map<String, ? extends Object> f136925a;

    /* renamed from: b */
    public float[] f136926b;

    /* renamed from: c */
    public byte[] f136927c;

    /* renamed from: d */
    public Aweme f136928d;

    /* renamed from: e */
    public String f136929e;

    static {
        Covode.recordClassIndex(70603);
    }

    public final String toString() {
        Integer num;
        String str;
        String str2;
        User author;
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (this.f136929e != null) {
            sb.append("enterType:" + this.f136929e + "},");
        }
        Integer num2 = null;
        if (this.f136928d != null) {
            StringBuilder sb2 = new StringBuilder("aweme:");
            Aweme aweme = this.f136928d;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            StringBuilder append = sb2.append(str).append("=[");
            Aweme aweme2 = this.f136928d;
            if (aweme2 == null || (author = aweme2.getAuthor()) == null) {
                str2 = null;
            } else {
                str2 = author.getNickname();
            }
            sb.append(append.append(str2).append(',').toString());
        }
        if (this.f136925a != null) {
            sb.append("extFeaturesMap=" + this.f136925a + ", ");
        }
        if (this.f136926b != null) {
            StringBuilder sb3 = new StringBuilder("extFloatArray.size:");
            float[] fArr = this.f136926b;
            if (fArr != null) {
                num = Integer.valueOf(fArr.length);
            } else {
                num = null;
            }
            sb.append(sb3.append(num).toString());
        }
        if (this.f136927c != null) {
            StringBuilder sb4 = new StringBuilder("extByteArray.size:");
            byte[] bArr = this.f136927c;
            if (bArr != null) {
                num2 = Integer.valueOf(bArr.length);
            }
            sb.append(sb4.append(num2).toString());
        }
        sb.append("}");
        String sb5 = sb.toString();
        C89219l.m154716b(sb5, "");
        return sb5;
    }
}
