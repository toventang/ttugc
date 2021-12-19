package com.p2082ss.android.ugc.aweme.story.base.distribution.dispatcher;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.story.base.AbstractC76618d;
import com.p2082ss.android.ugc.aweme.story.base.distribution.dispatcher.AbstractC76621c;
import java.util.Set;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.base.distribution.dispatcher.StoryReceiver */
public final class StoryReceiver implements AbstractC33974au {

    /* renamed from: a */
    public AbstractC88412b f171950a;

    /* renamed from: b */
    public final Object f171951b;

    /* renamed from: c */
    public final AbstractC76618d f171952c;

    /* renamed from: d */
    public final AbstractC76621c<?, ?> f171953d;

    static {
        Covode.recordClassIndex(89605);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        AbstractC76621c<?, ?> cVar = this.f171953d;
        AbstractC76618d dVar = this.f171952c;
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(this, "");
        Set<StoryReceiver> set = cVar.f171954a.get(dVar);
        if (set != null) {
            C89070n.m154532a((Iterable) set, (AbstractC89172b) new AbstractC76621c.C76625d(this));
        }
        cVar.f171954a.remove(dVar);
        AbstractC88412b bVar = this.f171950a;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    public StoryReceiver(Object obj, AbstractC76618d dVar, AbstractC76621c<?, ?> cVar) {
        C89219l.m154721d(obj, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(cVar, "");
        this.f171951b = obj;
        this.f171952c = dVar;
        this.f171953d = cVar;
        dVar.getLifecycle().mo4012a(this);
    }
}
