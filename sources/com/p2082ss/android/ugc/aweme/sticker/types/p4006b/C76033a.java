package com.p2082ss.android.ugc.aweme.sticker.types.p4006b;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ActivityC0218d;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.recorder.effect.composer.AbstractC31206b;
import com.p2082ss.android.ugc.asve.recorder.effect.composer.AbstractC31208c;
import com.p2082ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l;
import com.p2082ss.android.ugc.aweme.sticker.panel.C75575k;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75618a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75619b;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.ComposerHelper;
import com.p2082ss.android.ugc.effectmanager.effect.model.ComposerNode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89213f;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.p4614a.AbstractC89200e;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.b.a */
public final class C76033a extends AbstractC75614b implements AbstractC75576l {

    /* renamed from: a */
    public final List<ComposerNode> f170836a = new ArrayList();

    /* renamed from: b */
    public final List<ComposerNode> f170837b;

    /* renamed from: c */
    public final C1213t<List<ComposerNode>> f170838c;

    /* renamed from: d */
    public AbstractC89244h<? extends AbstractC76039b> f170839d;

    /* renamed from: e */
    public final ActivityC0218d f170840e;

    /* renamed from: f */
    public final AbstractC75655o f170841f;

    /* renamed from: g */
    public final AbstractC31206b f170842g;

    /* renamed from: h */
    public final C75575k f170843h;

    /* renamed from: i */
    private Effect f170844i;

    /* renamed from: j */
    private final AbstractC89171a<String> f170845j;

    static {
        Covode.recordClassIndex(88977);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l
    /* renamed from: a */
    public final void mo23176a(AbstractC75576l.EnumC75577a aVar) {
        C89219l.m154721d(aVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l
    /* renamed from: b */
    public final void mo23177b(AbstractC75576l.EnumC75577a aVar) {
        C89219l.m154721d(aVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l
    public final void cD_() {
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.b.a$c */
    public static final class C76037c implements AbstractC89200e, List<ComposerNode> {

        /* renamed from: a */
        final /* synthetic */ C76033a f170850a;

        /* renamed from: b */
        private final /* synthetic */ List<ComposerNode> f170851b;

        static {
            Covode.recordClassIndex(88981);
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection<? extends ComposerNode> collection) {
            C89219l.m154721d(collection, "");
            return this.f170851b.addAll(i, collection);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends ComposerNode> collection) {
            C89219l.m154721d(collection, "");
            return this.f170851b.addAll(collection);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<? extends Object> collection) {
            C89219l.m154721d(collection, "");
            return this.f170851b.containsAll(collection);
        }

        public final boolean isEmpty() {
            return this.f170851b.isEmpty();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<ComposerNode> iterator() {
            return this.f170851b.iterator();
        }

        @Override // java.util.List
        public final ListIterator<ComposerNode> listIterator() {
            return this.f170851b.listIterator();
        }

        @Override // java.util.List
        public final ListIterator<ComposerNode> listIterator(int i) {
            return this.f170851b.listIterator(i);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<? extends Object> collection) {
            C89219l.m154721d(collection, "");
            return this.f170851b.removeAll(collection);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<? extends Object> collection) {
            C89219l.m154721d(collection, "");
            return this.f170851b.retainAll(collection);
        }

        @Override // java.util.List
        public final List<ComposerNode> subList(int i, int i2) {
            return this.f170851b.subList(i, i2);
        }

        public final Object[] toArray() {
            return C89213f.m154698a(this);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) C89213f.m154699a(this, tArr);
        }

        public final /* bridge */ int size() {
            return this.f170851b.size();
        }

        public final void clear() {
            this.f170850a.f170836a.clear();
            this.f170850a.f170838c.setValue(this);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C76037c(C76033a aVar) {
            this.f170850a = aVar;
            this.f170851b = aVar.f170836a;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.List
        public final /* synthetic */ ComposerNode get(int i) {
            ComposerNode composerNode = this.f170851b.get(i);
            C89219l.m154716b(composerNode, "");
            return composerNode;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.List
        public final /* synthetic */ ComposerNode remove(int i) {
            ComposerNode remove = this.f170851b.remove(i);
            C89219l.m154716b(remove, "");
            return remove;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // java.util.List, java.util.Collection
        public final /* synthetic */ boolean add(ComposerNode composerNode) {
            C89219l.m154721d(composerNode, "");
            boolean add = this.f170850a.f170836a.add(composerNode);
            this.f170850a.f170838c.setValue(this);
            return add;
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof ComposerNode)) {
                return false;
            }
            C89219l.m154721d(obj, "");
            return this.f170851b.contains(obj);
        }

        public final int indexOf(Object obj) {
            if (!(obj instanceof ComposerNode)) {
                return -1;
            }
            C89219l.m154721d(obj, "");
            return this.f170851b.indexOf(obj);
        }

        public final int lastIndexOf(Object obj) {
            if (!(obj instanceof ComposerNode)) {
                return -1;
            }
            C89219l.m154721d(obj, "");
            return this.f170851b.lastIndexOf(obj);
        }

        @Override // java.util.List
        public final boolean remove(Object obj) {
            if (!(obj instanceof ComposerNode)) {
                return false;
            }
            C89219l.m154721d(obj, "");
            boolean remove = this.f170850a.f170836a.remove(obj);
            this.f170850a.f170838c.setValue(this);
            return remove;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
        @Override // java.util.List
        public final /* synthetic */ void add(int i, ComposerNode composerNode) {
            C89219l.m154721d(composerNode, "");
            this.f170851b.add(i, composerNode);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
        @Override // java.util.List
        public final /* synthetic */ ComposerNode set(int i, ComposerNode composerNode) {
            C89219l.m154721d(composerNode, "");
            ComposerNode composerNode2 = this.f170851b.set(i, composerNode);
            C89219l.m154716b(composerNode2, "");
            return composerNode2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo119742b() {
        AbstractC89244h<? extends AbstractC76039b> hVar;
        AbstractC76039b bVar;
        AbstractC89244h<? extends AbstractC76039b> hVar2 = this.f170839d;
        if (!(hVar2 == null || !hVar2.isInitialized() || (hVar = this.f170839d) == null || (bVar = (AbstractC76039b) hVar.getValue()) == null)) {
            bVar.mo119770c();
        }
        this.f170837b.clear();
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.b.a$b */
    static final class C76035b extends AbstractC89220m implements AbstractC89171a<C76040c> {

        /* renamed from: a */
        final /* synthetic */ C76033a f170848a;

        /* renamed from: b */
        final /* synthetic */ View f170849b;

        static {
            Covode.recordClassIndex(88979);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76035b(C76033a aVar, View view) {
            super(0);
            this.f170848a = aVar;
            this.f170849b = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C76040c invoke() {
            ActivityC0218d dVar = this.f170848a.f170840e;
            AbstractC75655o oVar = this.f170848a.f170841f;
            View view = this.f170849b;
            Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
            return new C76040c(dVar, oVar, (ViewGroup) view, this.f170848a.f170838c, this.f170848a.f170843h, new AbstractC89172b<ComposerNode, C89391z>(this.f170848a) {
                /* class com.p2082ss.android.ugc.aweme.sticker.types.p4006b.C76033a.C76035b.C760361 */

                static {
                    Covode.recordClassIndex(88980);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(ComposerNode composerNode) {
                    ComposerNode composerNode2 = composerNode;
                    C89219l.m154721d(composerNode2, "");
                    C76033a aVar = (C76033a) this.receiver;
                    if (aVar.f170837b.contains(composerNode2)) {
                        aVar.f170837b.remove(composerNode2);
                        AbstractC31206b bVar = aVar.f170842g;
                        List<ComposerNode> list = aVar.f170837b;
                        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                        for (T t : list) {
                            String unzipPath = t.effect.getUnzipPath();
                            if (unzipPath == null) {
                                C89219l.m154715b();
                            }
                            String extra = t.effect.getExtra();
                            if (extra == null) {
                                extra = "";
                            }
                            arrayList.add(new ComposerInfo(unzipPath, extra));
                        }
                        bVar.mo56823b(arrayList, 20000);
                    } else if (C89361p.m154872a(composerNode2.UI_name, "clear", true)) {
                        aVar.mo119742b();
                        aVar.f170842g.mo56827f();
                    } else {
                        aVar.f170841f.mo119283a(composerNode2.effect, new C76034a(aVar, composerNode2));
                    }
                    return C89391z.f203057a;
                }
            });
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b
    /* renamed from: a */
    public final void mo23210a() {
        AbstractC89244h<? extends AbstractC76039b> hVar;
        AbstractC76039b bVar;
        AbstractC89244h<? extends AbstractC76039b> hVar2 = this.f170839d;
        if (!(hVar2 == null || !hVar2.isInitialized() || (hVar = this.f170839d) == null || (bVar = (AbstractC76039b) hVar.getValue()) == null)) {
            bVar.mo119769b();
        }
        mo119742b();
        this.f170844i = null;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b
    /* renamed from: a */
    public final boolean mo23213a(C75618a aVar) {
        C89219l.m154721d(aVar, "");
        return C75466g.m132374z(aVar.f170022a);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l
    /* renamed from: a */
    public final void mo23175a(View view) {
        C89219l.m154721d(view, "");
        if (this.f170839d == null) {
            this.f170839d = C89250i.m154774a(EnumC89331m.NONE, new C76035b(this, view));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.b.a$d */
    static final class C76038d extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C76033a f170852a;

        /* renamed from: b */
        final /* synthetic */ ComposerNode f170853b;

        static {
            Covode.recordClassIndex(88982);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76038d(C76033a aVar, ComposerNode composerNode) {
            super(1);
            this.f170852a = aVar;
            this.f170853b = composerNode;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            int intValue = num.intValue();
            AbstractC31208c e = this.f170852a.f170842g.mo56826e();
            String unzipPath = this.f170853b.effect.getUnzipPath();
            String str = this.f170853b.tag_name;
            C89219l.m154716b(str, "");
            e.mo56841a(unzipPath, str, ((float) intValue) / 100.0f).mo56842a();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.b.a$a */
    public static final class C76034a implements IFetchEffectListener {

        /* renamed from: a */
        final /* synthetic */ C76033a f170846a;

        /* renamed from: b */
        final /* synthetic */ ComposerNode f170847b;

        static {
            Covode.recordClassIndex(88978);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onFail(Effect effect, ExceptionResult exceptionResult) {
            C89219l.m154721d(exceptionResult, "");
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onStart(Effect effect) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(Effect effect) {
            String str;
            AbstractC76039b bVar;
            Effect effect2 = effect;
            this.f170846a.f170837b.add(this.f170847b);
            AbstractC31206b bVar2 = this.f170846a.f170842g;
            List<ComposerNode> list = this.f170846a.f170837b;
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
            Iterator<T> it = list.iterator();
            while (true) {
                str = "";
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                String unzipPath = next.effect.getUnzipPath();
                if (unzipPath == null) {
                    C89219l.m154715b();
                }
                String extra = next.effect.getExtra();
                if (extra != null) {
                    str = extra;
                }
                arrayList.add(new ComposerInfo(unzipPath, str));
            }
            bVar2.mo56823b(arrayList, 20000);
            AbstractC31208c e = this.f170846a.f170842g.mo56826e();
            if (effect2 == null) {
                C89219l.m154715b();
            }
            String unzipPath2 = effect2.getUnzipPath();
            if (unzipPath2 == null) {
                C89219l.m154715b();
            }
            String str2 = this.f170847b.tag_name;
            C89219l.m154716b(str2, str);
            e.mo56841a(unzipPath2, str2, this.f170847b.default_value / 100.0f).mo56842a();
            AbstractC89244h<? extends AbstractC76039b> hVar = this.f170846a.f170839d;
            if (hVar != null && (bVar = (AbstractC76039b) hVar.getValue()) != null) {
                ComposerNode composerNode = this.f170847b;
                bVar.mo119767a(composerNode, new C76038d(this.f170846a, composerNode));
            }
        }

        C76034a(C76033a aVar, ComposerNode composerNode) {
            this.f170846a = aVar;
            this.f170847b = composerNode;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b
    /* renamed from: a */
    public final void mo23212a(C75619b bVar, C75618a aVar) {
        AbstractC76039b bVar2;
        AbstractC76039b bVar3;
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        AbstractC89244h<? extends AbstractC76039b> hVar = this.f170839d;
        if (!(hVar == null || (bVar3 = (AbstractC76039b) hVar.getValue()) == null)) {
            bVar3.mo119768a();
        }
        Effect effect = aVar.f170022a;
        ComposerNode parseComposerMaterial = ComposerHelper.parseComposerMaterial(effect.getUnzipPath(), this.f170845j.invoke(), new File(effect.getUnzipPath()).getParent());
        AbstractC89244h<? extends AbstractC76039b> hVar2 = this.f170839d;
        if (!(hVar2 == null || (bVar2 = (AbstractC76039b) hVar2.getValue()) == null)) {
            bVar2.mo119766a(parseComposerMaterial);
        }
        this.f170844i = effect;
    }

    public C76033a(AbstractC89171a<String> aVar, ActivityC0218d dVar, AbstractC75655o oVar, AbstractC31206b bVar, C75575k kVar) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(kVar, "");
        this.f170845j = aVar;
        this.f170840e = dVar;
        this.f170841f = oVar;
        this.f170842g = bVar;
        this.f170843h = kVar;
        C76037c cVar = new C76037c(this);
        this.f170837b = cVar;
        C1213t<List<ComposerNode>> tVar = new C1213t<>();
        tVar.setValue(cVar);
        this.f170838c = tVar;
    }
}
