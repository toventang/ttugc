package com.bytedance.ies.xelement;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.lynx.p2032b.p2033a.C28194a;
import com.lynx.p2032b.p2033a.p2034a.AbstractC28216e;
import com.lynx.p2032b.p2033a.p2034a.AbstractC28217f;
import com.lynx.p2032b.p2033a.p2034a.AbstractC28220i;
import com.lynx.p2032b.p2033a.p2040g.AbstractC28235b;
import com.lynx.p2032b.p2033a.p2040g.AbstractC28236c;
import com.lynx.p2032b.p2033a.p2040g.AbstractC28237d;
import com.lynx.p2032b.p2033a.p2040g.C28240g;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.C28719c;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.AbstractC28528p;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.LynxUI;
import com.lynx.tasm.behavior.p2052ui.UIGroup;
import com.lynx.tasm.behavior.p2052ui.view.C28698a;
import com.lynx.tasm.p2054c.C28724b;
import p4600h.p4611f.p4613b.C89219l;

public class LynxPullRefreshView extends UIGroup<C28194a> {

    /* renamed from: a */
    public static final C18916a f44777a = new C18916a((byte) 0);

    /* renamed from: b */
    private boolean f44778b = true;

    /* renamed from: c */
    private boolean f44779c = true;

    static {
        Covode.recordClassIndex(21639);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public boolean canHaveFlattenChild() {
        return false;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void dispatchProperties(C28716v vVar) {
        ReadableMap readableMap = vVar.f67715a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            int hashCode = nextKey.hashCode();
            boolean z = true;
            if (hashCode != -2113012155) {
                if (hashCode == -1813223279 && nextKey.equals("enable-refresh")) {
                    if (!readableMap.isNull(nextKey)) {
                        z = readableMap.getBoolean(nextKey, true);
                    }
                    setEnableRefresh(z);
                }
            } else if (nextKey.equals("enable-loadmore")) {
                if (!readableMap.isNull(nextKey)) {
                    z = readableMap.getBoolean(nextKey, true);
                }
                setEnableLoadMore(z);
            }
            super.dispatchProperties(vVar);
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public boolean needCustomLayout() {
        return true;
    }

    /* renamed from: com.bytedance.ies.xelement.LynxPullRefreshView$a */
    public static final class C18916a {
        static {
            Covode.recordClassIndex(21642);
        }

        private C18916a() {
        }

        public /* synthetic */ C18916a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.xelement.LynxPullRefreshView$d */
    public static final class C18919d extends C28240g {

        /* renamed from: a */
        final /* synthetic */ LynxPullRefreshView f44782a;

        static {
            Covode.recordClassIndex(21645);
        }

        @Override // com.lynx.p2032b.p2033a.p2040g.C28240g, com.lynx.p2032b.p2033a.p2040g.AbstractC28236c
        /* renamed from: a */
        public final void mo29964a() {
            C28719c cVar;
            AbstractC28520j jVar = this.f44782a.mContext;
            if (jVar != null && (cVar = jVar.f67064e) != null) {
                cVar.mo49834a(new C28724b(this.f44782a.getSign(), "headerreleased"));
            }
        }

        C18919d(LynxPullRefreshView lynxPullRefreshView) {
            this.f44782a = lynxPullRefreshView;
        }
    }

    public LynxPullRefreshView(AbstractC28520j jVar) {
        super(jVar);
    }

    @AbstractC28528p
    public void autoStartRefresh(ReadableMap readableMap) {
        C89219l.m154719c(readableMap, "");
        ((C28194a) this.mView).mo48246g();
    }

    @AbstractC28528p
    public void finishRefresh(ReadableMap readableMap) {
        C89219l.m154719c(readableMap, "");
        ((C28194a) this.mView).mo48235b();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            layoutParams.width = -1;
            layoutParams.height = -2;
        }
        return new RelativeLayout.LayoutParams(-1, -2);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public void removeChild(LynxBaseUI lynxBaseUI) {
        C89219l.m154719c(lynxBaseUI, "");
        if (lynxBaseUI instanceof LynxUI) {
            this.mChildren.remove(lynxBaseUI);
        }
    }

    @AbstractC28525m(mo49059a = "enable-loadmore", mo49064f = true)
    public final void setEnableLoadMore(boolean z) {
        this.f44779c = z;
        C28194a aVar = (C28194a) this.mView;
        if (aVar != null) {
            aVar.mo48236b(z);
        }
    }

    @AbstractC28525m(mo49059a = "enable-refresh", mo49064f = true)
    public final void setEnableRefresh(boolean z) {
        this.f44778b = z;
        C28194a aVar = (C28194a) this.mView;
        if (aVar != null) {
            aVar.mo48238c(z);
        }
    }

    /* renamed from: com.bytedance.ies.xelement.LynxPullRefreshView$b */
    static final class C18917b implements AbstractC28237d {

        /* renamed from: a */
        final /* synthetic */ LynxPullRefreshView f44780a;

        static {
            Covode.recordClassIndex(21643);
        }

        C18917b(LynxPullRefreshView lynxPullRefreshView) {
            this.f44780a = lynxPullRefreshView;
        }

        @Override // com.lynx.p2032b.p2033a.p2040g.AbstractC28237d
        /* renamed from: a */
        public final void mo29962a(AbstractC28220i iVar) {
            C28719c cVar;
            C89219l.m154719c(iVar, "");
            AbstractC28520j jVar = this.f44780a.mContext;
            if (jVar != null && (cVar = jVar.f67064e) != null) {
                cVar.mo49834a(new C28724b(this.f44780a.getSign(), "startrefresh"));
            }
        }
    }

    /* renamed from: com.bytedance.ies.xelement.LynxPullRefreshView$c */
    static final class C18918c implements AbstractC28235b {

        /* renamed from: a */
        final /* synthetic */ LynxPullRefreshView f44781a;

        static {
            Covode.recordClassIndex(21644);
        }

        C18918c(LynxPullRefreshView lynxPullRefreshView) {
            this.f44781a = lynxPullRefreshView;
        }

        @Override // com.lynx.p2032b.p2033a.p2040g.AbstractC28235b
        /* renamed from: a_ */
        public final void mo29963a_(AbstractC28220i iVar) {
            C28719c cVar;
            C89219l.m154719c(iVar, "");
            AbstractC28520j jVar = this.f44781a.mContext;
            if (jVar != null && (cVar = jVar.f67064e) != null) {
                cVar.mo49834a(new C28724b(this.f44781a.getSign(), "startloadmore"));
            }
        }
    }

    @AbstractC28528p
    public void finishLoadMore(ReadableMap readableMap) {
        C89219l.m154719c(readableMap, "");
        if (readableMap.getBoolean("has_more", true)) {
            ((C28194a) this.mView).mo48237c();
        } else {
            ((C28194a) this.mView).mo48245f();
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI
    public /* synthetic */ View createView(Context context) {
        if (context == null) {
            return null;
        }
        this.f44778b = true;
        this.f44779c = true;
        C28194a aVar = new C28194a(context);
        aVar.mo48238c(this.f44778b);
        aVar.mo48236b(this.f44779c);
        aVar.mo48230a(new C18917b(this));
        aVar.mo48228a(new C18918c(this));
        aVar.mo48229a((AbstractC28236c) new C18919d(this));
        return aVar;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public void insertChild(LynxBaseUI lynxBaseUI, int i) {
        C89219l.m154719c(lynxBaseUI, "");
        onInsertChild(lynxBaseUI, i);
        if (lynxBaseUI instanceof LynxRefreshHeader) {
            AbstractC28520j jVar = this.mContext;
            C89219l.m154709a((Object) jVar, "");
            C19291k kVar = new C19291k(jVar, (byte) 0);
            kVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
            C28698a aVar = (C28698a) ((LynxUI) lynxBaseUI).mView;
            C89219l.m154709a((Object) aVar, "");
            C89219l.m154719c(aVar, "");
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(13);
            kVar.addView(aVar, layoutParams);
            ((C28194a) this.mView).mo48227a((AbstractC28217f) kVar);
        } else if (lynxBaseUI instanceof LynxRefreshFooter) {
            AbstractC28520j jVar2 = this.mContext;
            C89219l.m154709a((Object) jVar2, "");
            C19290j jVar3 = new C19290j(jVar2, (byte) 0);
            jVar3.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
            C28698a aVar2 = (C28698a) ((LynxUI) lynxBaseUI).mView;
            C89219l.m154709a((Object) aVar2, "");
            C89219l.m154719c(aVar2, "");
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams2.addRule(13);
            jVar3.addView(aVar2, layoutParams2);
            ((C28194a) this.mView).mo48226a((AbstractC28216e) jVar3);
        } else if (lynxBaseUI instanceof LynxUI) {
            ((C28194a) this.mView).mo48225a(((LynxUI) lynxBaseUI).mView);
        }
    }
}
