package com.p2082ss.android.ugc.aweme.sticker.data;

import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.data.c */
public final class C75308c {

    /* renamed from: a */
    public final List<C75313h> f169303a;

    /* renamed from: b */
    private int f169304b;

    /* renamed from: c */
    private int f169305c = -1;

    static {
        Covode.recordClassIndex(88225);
    }

    public C75308c(List<C75313h> list) {
        C89219l.m154721d(list, "");
        this.f169303a = list;
    }

    /* renamed from: a */
    public final String mo118854a(int i) {
        if (i < 0) {
            return null;
        }
        int i2 = this.f169305c;
        if (i > i2) {
            int i3 = this.f169304b;
            int size = this.f169303a.size() - 1;
            if (i3 > size) {
                return null;
            }
            while (true) {
                long j = (long) i;
                if (j < this.f169303a.get(i3).getStartTime()) {
                    return null;
                }
                if (this.f169303a.get(i3).getStartTime() <= j && j < this.f169303a.get(i3).getEndTime()) {
                    String text = this.f169303a.get(i3).getText();
                    this.f169304b = i3;
                    this.f169305c = i;
                    return text;
                } else if (i3 == size) {
                    return null;
                } else {
                    i3++;
                }
            }
        } else if (i == i2) {
            C75313h hVar = (C75313h) C89070n.m154561b((List) this.f169303a, this.f169304b);
            if (hVar != null) {
                return hVar.getText();
            }
            return null;
        } else {
            for (int i4 = this.f169304b; i4 >= 0; i4--) {
                long j2 = (long) i;
                if (j2 > this.f169303a.get(i4).getEndTime()) {
                    return null;
                }
                if (this.f169303a.get(i4).getStartTime() <= j2 && j2 < this.f169303a.get(i4).getEndTime()) {
                    String text2 = this.f169303a.get(i4).getText();
                    this.f169304b = i4;
                    this.f169305c = i;
                    return text2;
                }
            }
            return null;
        }
    }
}
