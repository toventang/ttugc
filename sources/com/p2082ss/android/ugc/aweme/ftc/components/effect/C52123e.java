package com.p2082ss.android.ugc.aweme.ftc.components.effect;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0975m;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.effect.C46374t;
import com.p2082ss.android.ugc.aweme.effect.C46386w;
import com.p2082ss.android.ugc.aweme.effect.C46392y;
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

/* renamed from: com.ss.android.ugc.aweme.ftc.components.effect.e */
public final class C52123e extends AbstractC0975m {

    /* renamed from: a */
    public Fragment f120054a;

    /* renamed from: b */
    C46300a f120055b;

    /* renamed from: c */
    public boolean f120056c = false;

    /* renamed from: d */
    private List<EffectCategoryResponse> f120057d = new ArrayList();

    /* renamed from: e */
    private Context f120058e;

    /* renamed from: f */
    private List<Effect> f120059f = new ArrayList();

    static {
        Covode.recordClassIndex(61504);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f120057d.size();
    }

    /* renamed from: b */
    public final EffectCategoryResponse mo87840b(int i) {
        if (i < this.f120057d.size()) {
            return this.f120057d.get(i);
        }
        return null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i) {
        if (i == getCount() - 1) {
            return this.f120058e.getString(R.string.g9q);
        }
        return this.f120057d.get(i).getName();
    }

    @Override // androidx.fragment.app.AbstractC0975m
    /* renamed from: a */
    public final Fragment mo3649a(int i) {
        if (i == getCount() - 1 && !this.f120056c) {
            return new C46392y();
        }
        if (C89219l.m154714a((Object) "sticker", (Object) this.f120057d.get(i).getKey())) {
            C46386w a = C46386w.C46387a.m89497a(this.f120057d.get(i).getTotalEffects(), this.f120057d.get(i).getKey());
            a.f108006f = this.f120055b;
            return a;
        }
        C46374t a2 = C46374t.C46375a.m89481a(this.f120057d.get(i).getTotalEffects(), this.f120057d.get(i).getKey(), false);
        a2.f108006f = this.f120055b;
        return a2;
    }

    /* renamed from: a */
    public final void mo87839a(List<EffectCategoryResponse> list) {
        if (list != null) {
            this.f120057d = list;
            this.f120059f.clear();
            ArrayList<Effect> arrayList = new ArrayList();
            for (EffectCategoryResponse effectCategoryResponse : this.f120057d) {
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
                        this.f120059f.add(effect);
                    }
                    i++;
                }
            } else {
                for (Effect effect2 : arrayList) {
                    if (!C46300a.C46301a.m89337a().mo78914a(effect2)) {
                        this.f120059f.add(effect2);
                    }
                }
            }
            this.f120055b.mo78791a(this.f120059f);
            notifyDataSetChanged();
        }
    }

    C52123e(AbstractC0952i iVar, Context context) {
        super(iVar);
        this.f120058e = context;
        C521241 r2 = new AbstractC46312c() {
            /* class com.p2082ss.android.ugc.aweme.ftc.components.effect.C52123e.C521241 */

            static {
                Covode.recordClassIndex(61505);
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
        this.f120055b = bVar.mo78796a();
        C63244g.m114602a().mo73294v();
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.AbstractC0975m
    public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        this.f120054a = (Fragment) obj;
        super.setPrimaryItem(viewGroup, i, obj);
    }
}
