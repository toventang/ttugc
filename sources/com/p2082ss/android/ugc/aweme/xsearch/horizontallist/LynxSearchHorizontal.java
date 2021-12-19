package com.p2082ss.android.ugc.aweme.xsearch.horizontallist;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.bytedance.android.alog.C2688c;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.AbstractC28528p;
import com.lynx.tasm.behavior.p2052ui.view.UISimpleView;
import com.p2082ss.android.ugc.aweme.xsearch.C81687b;
import com.p2082ss.android.ugc.aweme.xsearch.horizontallist.AbstractC81695b;
import com.p2082ss.android.ugc.aweme.xsearch.horizontallist.C81704g;
import java.util.List;
import java.util.Set;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.xsearch.horizontallist.LynxSearchHorizontal */
public final class LynxSearchHorizontal extends UISimpleView<C81704g> implements AbstractC81695b {

    /* renamed from: b */
    public static final C81693a f182667b = new C81693a((byte) 0);

    static {
        Covode.recordClassIndex(95097);
    }

    @AbstractC28525m(mo49059a = "anchormargin")
    public final void anchorMarginFromLynx(String str) {
    }

    @AbstractC28525m(mo49059a = "anchortype")
    public final void anchorTypeFromLynx(String str) {
    }

    /* renamed from: com.ss.android.ugc.aweme.xsearch.horizontallist.LynxSearchHorizontal$a */
    public static final class C81693a {
        static {
            Covode.recordClassIndex(95098);
        }

        private C81693a() {
        }

        public /* synthetic */ C81693a(byte b) {
            this();
        }
    }

    @AbstractC28528p
    public final void becomeactive() {
        C81704g gVar = (C81704g) this.mView;
        gVar.f182703e.mo125392a(true);
        C81719i iVar = gVar.f182703e;
        C2688c.m7778a(1, "HorizontalContainer", "SearchHorizontalInnerContainer:  attachAutoPlay");
        iVar.f182731e.f182760b.notifyDataSetChanged();
        gVar.f182703e.mo125393b();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public final void initialize() {
        super.initialize();
        ((C81704g) this.mView).setEventChangeListener(new C81687b(this, (Set) AbstractC81695b.C81697b.f182676a.getValue()));
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public final void layout() {
        C89219l.m154721d("LynxSearchHorizontal layout", "");
        super.layout();
        getLeft();
        getTop();
        getWidth();
        getHeight();
        getBound();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public final void measure() {
        C89219l.m154721d("LynxSearchHorizontal measure", "");
        super.measure();
        getWidth();
        getHeight();
    }

    @AbstractC28528p
    public final void resignactive() {
        C81704g gVar = (C81704g) this.mView;
        gVar.f182703e.mo125392a(false);
        C81719i iVar = gVar.f182703e;
        C2688c.m7778a(1, "HorizontalContainer", "SearchHorizontalInnerContainer:  detachAutoPlay");
        iVar.f182731e.f182760b.notifyDataSetChanged();
    }

    public LynxSearchHorizontal(AbstractC28520j jVar) {
        super(jVar);
    }

    @AbstractC28525m(mo49059a = "sessionid")
    public final void setSessionIdFromLynx(int i) {
        ((C81704g) this.mView).setSessionIdFromLynx(i);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI
    public final /* synthetic */ View createView(Context context) {
        if (context == null) {
            C89219l.m154715b();
        }
        return new C81704g(context, (byte) 0);
    }

    @AbstractC28525m(mo49059a = "logextra")
    public final void logExtraFromLynx(ReadableMap readableMap) {
        C81704g gVar = (C81704g) this.mView;
        if (readableMap != null) {
            gVar.f182703e.f182728b = readableMap;
            gVar.f182700b = true;
        }
    }

    @AbstractC28525m(mo49059a = "activearea")
    public final void activeAreaFromLynx(ReadableMap readableMap) {
        C81733l holderWrapper;
        C81704g gVar = (C81704g) this.mView;
        if ((readableMap instanceof JavaOnlyMap) && (holderWrapper = gVar.getHolderWrapper()) != null) {
            gVar.mo125380a((JavaOnlyMap) readableMap, AbstractC81695b.C81696a.class, new C81704g.C81706b(holderWrapper));
        }
    }

    @AbstractC28525m(mo49059a = "horizontalstyle")
    public final void horizontalStyleFromLynx(ReadableMap readableMap) {
        C81704g gVar = (C81704g) this.mView;
        if (!(readableMap instanceof JavaOnlyMap)) {
            gVar.f182702d = true;
            return;
        }
        C81733l holderWrapper = gVar.getHolderWrapper();
        if (holderWrapper != null) {
            gVar.mo125380a((JavaOnlyMap) readableMap, AbstractC81695b.C81699c.class, new C81704g.C81713i(holderWrapper, gVar, readableMap));
        }
    }

    @AbstractC28528p
    public final void scrolltoindex(ReadableMap readableMap) {
        new StringBuilder("scrolltoindex: anchorInfo: { ").append(readableMap).append(" }");
    }

    @AbstractC28525m(mo49059a = "datalist")
    public final void bind(ReadableMap readableMap) {
        C81704g gVar = (C81704g) this.mView;
        if (readableMap != null) {
            AbstractC88412b a = AbstractC88924h.m154135a(readableMap).mo143205b(new C81704g.C81707c(gVar)).mo143204b(C88925a.m154160a(C88946a.f201990b)).mo143195a(C88391a.m153580a(C88392a.f200660a)).mo143191a(new C81704g.C81708d(gVar), C81704g.C81709e.f182709a, new C81704g.C81710f(gVar, gVar.getDisposableList().size()));
            List<AbstractC88412b> disposableList = gVar.getDisposableList();
            C89219l.m154716b(a, "");
            disposableList.add(a);
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void updateLayout(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect) {
        C89219l.m154721d("LynxSearchHorizontal updateLayout", "");
        super.updateLayout(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, rect);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void updateLayoutInfo(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect) {
        C89219l.m154721d("LynxSearchHorizontal updateLayoutInfo", "");
        super.updateLayoutInfo(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, rect);
    }
}
