package com.p2082ss.android.ugc.aweme.tools.draft;

import androidx.recyclerview.widget.C1445j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.p2082ss.android.ugc.aweme.draft.model.C43222b;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.h */
public final class C78378h extends C1445j.AbstractC1447a {

    /* renamed from: a */
    public List<C43223c> f176110a;

    /* renamed from: b */
    public List<C43223c> f176111b;

    /* renamed from: c */
    private final String f176112c = "AwemeDraftDiffCallback";

    /* renamed from: d */
    private final int f176113d;

    static {
        Covode.recordClassIndex(91504);
    }

    @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
    /* renamed from: a */
    public final int mo3768a() {
        return this.f176110a.size();
    }

    @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
    /* renamed from: b */
    public final int mo3770b() {
        return this.f176111b.size();
    }

    public C78378h(List<C43223c> list, List<C43223c> list2) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        this.f176110a = list;
        this.f176111b = list2;
    }

    @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
    /* renamed from: b */
    public final boolean mo3771b(int i, int i2) {
        String f;
        Object obj = "";
        if (this.f176110a.get(i).f100924x == this.f176113d) {
            String f2 = this.f176110a.get(i).mo73676f();
            C43223c cVar = this.f176111b.get(i2);
            if (!(cVar == null || (f = cVar.mo73676f()) == null)) {
                obj = f;
            }
            return C89219l.m154714a((Object) f2, obj);
        }
        int i3 = this.f176110a.get(i).f100924x;
        C43223c cVar2 = this.f176111b.get(i2);
        if (cVar2 != null) {
            obj = Integer.valueOf(cVar2.f100924x);
        }
        if ((obj instanceof Integer) && i3 == ((Integer) obj).intValue()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
    /* renamed from: c */
    public final boolean mo3772c(int i, int i2) {
        List<String> list;
        List<String> list2;
        C43222b bVar;
        CanvasVideoData canvasVideoData;
        C43223c cVar = this.f176110a.get(i);
        C43223c cVar2 = this.f176111b.get(i2);
        CanvasVideoData canvasVideoData2 = cVar.f100900W.f100842bo;
        String str = null;
        if (canvasVideoData2 != null) {
            list = canvasVideoData2.getSourceInfo();
        } else {
            list = null;
        }
        if (cVar2 == null || (bVar = cVar2.f100900W) == null || (canvasVideoData = bVar.f100842bo) == null) {
            list2 = null;
        } else {
            list2 = canvasVideoData.getSourceInfo();
        }
        if (C89219l.m154714a(list, list2)) {
            return true;
        }
        String str2 = cVar.f100900W.f100760T;
        if (cVar2 != null) {
            str = cVar2.f100900W.f100760T;
        }
        if (C89219l.m154714a((Object) str2, (Object) str)) {
            return true;
        }
        return false;
    }
}
