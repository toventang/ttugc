package com.p2082ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.jedi.C42135b;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41532h;
import com.p2082ss.android.ugc.aweme.discover.p2775j.C42083h;
import com.p2082ss.android.ugc.aweme.discover.p2775j.C42088k;
import com.p2082ss.android.ugc.aweme.discover.p2775j.C42098m;
import com.p2082ss.android.ugc.aweme.discover.p2775j.C42115q;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.C42707ax;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.C42978v;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.C42991x;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.C42994y;
import com.p2082ss.android.ugc.aweme.p2725d.AbstractC40912d;
import com.p2082ss.android.ugc.aweme.p2725d.C40909a;
import com.p2082ss.android.ugc.aweme.search.C67458j;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.search.p3696l.EnumC67634k;
import com.p2082ss.android.ugc.aweme.search.p3696l.RunnableC67646p;
import com.p2082ss.android.ugc.aweme.search.p3700n.C67694f;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.ak */
public final class C41635ak<T extends Fragment> extends AbstractC41730l<T> {

    /* renamed from: b */
    public C67678d f97109b;

    /* renamed from: c */
    public T f97110c;

    /* renamed from: f */
    private Context f97111f;

    static {
        Covode.recordClassIndex(49548);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i) {
        if (i == C67458j.f151133b) {
            return this.f97111f.getString(R.string.d43);
        }
        if (i == C67458j.f151134c) {
            return this.f97111f.getString(R.string.h5_);
        }
        if (i == C67458j.f151136e) {
            return this.f97111f.getString(R.string.dbc);
        }
        if (i == C67458j.f151137f) {
            return this.f97111f.getString(R.string.fva);
        }
        if (i == C67458j.f151138g) {
            return this.f97111f.getString(R.string.aa6);
        }
        if (i == C67458j.f151135d) {
            return this.f97111f.getString(R.string.ff5);
        }
        if (i == C67458j.f151139h) {
            return this.f97111f.getString(R.string.ed5);
        }
        return super.getPageTitle(i);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.adapter.AbstractC41730l
    /* renamed from: d */
    public final Fragment mo70846d(int i) {
        AbstractC42670am qVar;
        String str;
        if (i == C67458j.f151133b) {
            Context context = this.f97111f;
            if (context instanceof AbstractC40912d) {
                AbstractC40912d dVar = (AbstractC40912d) context;
                C89219l.m154721d(dVar, "");
                C40909a.f95720a.post(new RunnableC67646p(dVar));
            }
        }
        C67678d dVar2 = this.f97109b;
        if (i == C67458j.f151133b) {
            qVar = (AbstractC42670am) EnumC67634k.INSTANCE.computeIfAbsent(C42135b.class, C42707ax.f99614a);
        } else if (i == C67458j.f151134c) {
            qVar = new C42115q();
        } else if (i == C67458j.f151136e) {
            if (C41532h.m83470a()) {
                qVar = new C42991x();
            } else {
                qVar = new C42098m();
            }
        } else if (i == C67458j.f151137f) {
            qVar = new C42994y();
        } else if (i == C67458j.f151138g) {
            qVar = new C42083h();
        } else if (i == C67458j.f151135d) {
            qVar = new C42088k();
        } else if (i == C67458j.f151139h) {
            qVar = new C42978v();
        } else {
            qVar = new C42115q();
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable(AbstractC42690av.f99492G, dVar2);
        qVar.setArguments(bundle);
        qVar.f99497B = i;
        qVar.f99506q.f151723a = i;
        C67694f fVar = qVar.f99506q;
        if (i == C67458j.f151133b) {
            str = "general";
        } else if (i == C67458j.f151135d) {
            str = "video";
        } else if (i == C67458j.f151134c) {
            str = "user";
        } else if (i == C67458j.f151136e) {
            str = "music";
        } else if (i == C67458j.f151138g) {
            str = "challenge";
        } else {
            str = "";
        }
        C89219l.m154721d(str, "");
        fVar.f151724b = str;
        return qVar;
    }

    public C41635ak(AbstractC0952i iVar, Context context, int i) {
        super(iVar, i);
        this.f97111f = context;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.adapter.AbstractC41593a, androidx.viewpager.widget.PagerAdapter, com.p2082ss.android.ugc.aweme.lego.p3393c.AbstractC58188b
    public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        this.f97110c = (T) ((Fragment) obj);
        super.setPrimaryItem(viewGroup, i, obj);
    }
}
