package com.zhihu.matisse;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import com.zhihu.matisse.internal.entity.C87956c;
import com.zhihu.matisse.p4511a.AbstractC87937a;
import com.zhihu.matisse.p4518ui.MatisseActivity;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: com.zhihu.matisse.c */
public final class C87942c {

    /* renamed from: a */
    private final C87936a f199702a;

    /* renamed from: b */
    private final C87956c f199703b;

    static {
        Covode.recordClassIndex(103957);
    }

    /* renamed from: a */
    public final C87942c mo142439a() {
        this.f199703b.f199749c = true;
        return this;
    }

    /* renamed from: b */
    public final C87942c mo142442b() {
        this.f199703b.f199750d = R.style.fx;
        return this;
    }

    /* renamed from: c */
    public final C87942c mo142444c() {
        this.f199703b.f199752f = false;
        return this;
    }

    /* renamed from: d */
    public final C87942c mo142445d() {
        this.f199703b.f199751e = -1;
        return this;
    }

    /* renamed from: e */
    public final C87942c mo142446e() {
        this.f199703b.f199761o = 0.85f;
        return this;
    }

    /* renamed from: a */
    public final C87942c mo142441a(AbstractC87937a aVar) {
        if (this.f199703b.f199756j == null) {
            this.f199703b.f199756j = new ArrayList();
        }
        this.f199703b.f199756j.add(aVar);
        return this;
    }

    /* renamed from: b */
    public final void mo142443b(int i) {
        Activity a = this.f199702a.mo142433a();
        if (a != null) {
            Intent intent = new Intent(a, MatisseActivity.class);
            Fragment b = this.f199702a.mo142435b();
            if (b != null) {
                b.startActivityForResult(intent, i);
            } else {
                a.startActivityForResult(intent, i);
            }
        }
    }

    /* renamed from: a */
    public final C87942c mo142440a(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSelectable must be greater than or equal to one");
        } else if (this.f199703b.f199754h > 0 || this.f199703b.f199755i > 0) {
            throw new IllegalStateException("already set maxImageSelectable and maxVideoSelectable");
        } else {
            this.f199703b.f199753g = i;
            return this;
        }
    }

    C87942c(C87936a aVar, Set<EnumC87938b> set) {
        this.f199702a = aVar;
        C87956c cVar = C87956c.C87957a.f199768a;
        cVar.f199747a = null;
        cVar.f199748b = true;
        cVar.f199749c = false;
        cVar.f199750d = R.style.fy;
        cVar.f199751e = 0;
        cVar.f199752f = false;
        cVar.f199753g = 1;
        cVar.f199754h = 0;
        cVar.f199755i = 0;
        cVar.f199756j = null;
        cVar.f199757k = false;
        cVar.f199758l = null;
        cVar.f199759m = 3;
        cVar.f199760n = 0;
        cVar.f199761o = 0.5f;
        cVar.f199762p = true;
        cVar.f199764r = false;
        cVar.f199765s = false;
        cVar.f199766t = Integer.MAX_VALUE;
        this.f199703b = cVar;
        cVar.f199747a = set;
        cVar.f199748b = true;
        cVar.f199751e = -1;
    }
}
