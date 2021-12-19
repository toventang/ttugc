package com.p2082ss.android.ugc.aweme.effect;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0975m;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.effect.C46374t;
import com.p2082ss.android.ugc.aweme.effect.C46386w;
import com.p2082ss.android.ugc.aweme.effect.p2889b.C46300a;
import com.p2082ss.android.ugc.aweme.effect.p2889b.p2890a.AbstractC46312c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.effect.r */
public final class C46369r extends AbstractC0975m {

    /* renamed from: a */
    public Fragment f108067a;

    /* renamed from: b */
    public C46300a f108068b;

    /* renamed from: c */
    public boolean f108069c = false;

    /* renamed from: d */
    public boolean f108070d = true;

    /* renamed from: e */
    private List<EffectCategoryResponse> f108071e = new ArrayList();

    /* renamed from: f */
    private Context f108072f;

    /* renamed from: g */
    private List<Effect> f108073g = new ArrayList();

    static {
        Covode.recordClassIndex(54946);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f108071e.size();
    }

    /* renamed from: b */
    public final EffectCategoryResponse mo78868b(int i) {
        if (i < this.f108071e.size()) {
            return this.f108071e.get(i);
        }
        return null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i) {
        if (i == getCount() - 1) {
            return this.f108072f.getString(R.string.g9q);
        }
        return this.f108071e.get(i).getName();
    }

    @Override // androidx.fragment.app.AbstractC0975m
    /* renamed from: a */
    public final Fragment mo3649a(int i) {
        if (i == getCount() - 1 && !this.f108069c) {
            return new C46392y();
        }
        if (C89219l.m154714a((Object) "sticker", (Object) this.f108071e.get(i).getKey())) {
            C46386w a = C46386w.C46387a.m89497a(this.f108071e.get(i).getTotalEffects(), this.f108071e.get(i).getKey());
            a.f108006f = this.f108068b;
            return a;
        }
        C46374t a2 = C46374t.C46375a.m89481a(this.f108071e.get(i).getTotalEffects(), this.f108071e.get(i).getKey(), this.f108070d);
        a2.f108006f = this.f108068b;
        return a2;
    }

    /* renamed from: a */
    public final void mo78867a(List<EffectCategoryResponse> list) {
        if (list != null) {
            this.f108071e = list;
            this.f108073g.clear();
            ArrayList<Effect> arrayList = new ArrayList();
            for (EffectCategoryResponse effectCategoryResponse : this.f108071e) {
                List<Effect> totalEffects = effectCategoryResponse.getTotalEffects();
                if (totalEffects != null) {
                    arrayList.addAll(totalEffects);
                }
            }
            int c = C63244g.m114602a().mo73278f().mo73334c();
            if (c >= 0) {
                int i = 0;
                while (i < c && i < arrayList.size()) {
                    Effect effect = (Effect) arrayList.get(i);
                    if (!C46300a.C46301a.m89337a().mo78914a(effect)) {
                        this.f108073g.add(effect);
                    }
                    i++;
                }
            } else {
                for (Effect effect2 : arrayList) {
                    if (!C46300a.C46301a.m89337a().mo78914a(effect2)) {
                        this.f108073g.add(effect2);
                    }
                }
            }
            this.f108068b.mo78791a(this.f108073g);
            notifyDataSetChanged();
        }
    }

    public C46369r(AbstractC0952i iVar, Context context) {
        super(iVar);
        this.f108072f = context;
        C463701 r2 = new AbstractC46312c() {
            /* class com.p2082ss.android.ugc.aweme.effect.C46369r.C463701 */

            static {
                Covode.recordClassIndex(54947);
            }

            @Override // com.p2082ss.android.ugc.aweme.effect.p2889b.p2890a.AbstractC46312c
            /* renamed from: a */
            public final Effect mo78802a(Queue<Effect> queue) {
                return null;
            }

            @Override // com.p2082ss.android.ugc.aweme.effect.p2889b.p2890a.AbstractC46312c
            /* renamed from: a */
            public final boolean mo78803a() {
                return false;
            }
        };
        C46300a.C46302b bVar = new C46300a.C46302b();
        bVar.f107950a = 3;
        bVar.f107951b = r2;
        this.f108068b = bVar.mo78796a();
        C63244g.m114602a().mo73294v();
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.AbstractC0975m
    public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        this.f108067a = (Fragment) obj;
        super.setPrimaryItem(viewGroup, i, obj);
    }
}
