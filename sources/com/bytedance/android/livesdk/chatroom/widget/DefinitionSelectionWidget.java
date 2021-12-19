package com.bytedance.android.livesdk.chatroom.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.broadcast.model.C3270n;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.p229d.AbstractC4051b;
import com.bytedance.android.live.p250i.p251a.AbstractC4357d;
import com.bytedance.android.live.p379n.AbstractC5777j;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.p492g.C7573e;
import com.bytedance.android.livesdk.event.C8454g;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p561j.C9034ba;
import com.bytedance.android.livesdk.p561j.C9058bx;
import com.bytedance.android.livesdk.p561j.C9096dh;
import com.bytedance.android.livesdk.p561j.C9126h;
import com.bytedance.android.livesdk.p561j.C9127i;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.android.livesdkapi.depend.model.live.C11729j;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.android.livesdkapi.session.C11870f;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public final class DefinitionSelectionWidget extends LiveRecyclableWidget implements View.OnClickListener, AbstractC33974au {

    /* renamed from: a */
    public static final C8133a f20168a = new C8133a((byte) 0);

    /* renamed from: b */
    private ImageView f20169b;

    static {
        Covode.recordClassIndex(8944);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bft;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.DefinitionSelectionWidget$a */
    public static final class C8133a {
        static {
            Covode.recordClassIndex(8945);
        }

        private C8133a() {
        }

        public /* synthetic */ C8133a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.DefinitionSelectionWidget$c */
    static final class C8135c extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ DefinitionSelectionWidget f20171a;

        static {
            Covode.recordClassIndex(8947);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8135c(DefinitionSelectionWidget definitionSelectionWidget) {
            super(1);
            this.f20171a = definitionSelectionWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            DefinitionSelectionWidget definitionSelectionWidget = this.f20171a;
            if (booleanValue) {
                View view = definitionSelectionWidget.getView();
                if (view != null) {
                    view.setVisibility(4);
                }
            } else {
                definitionSelectionWidget.show();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.DefinitionSelectionWidget$d */
    static final class C8136d extends AbstractC89220m implements AbstractC89172b<C3270n.C3271a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ DefinitionSelectionWidget f20172a;

        static {
            Covode.recordClassIndex(8948);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8136d(DefinitionSelectionWidget definitionSelectionWidget) {
            super(1);
            this.f20172a = definitionSelectionWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C3270n.C3271a aVar) {
            C3270n.C3271a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            DefinitionSelectionWidget definitionSelectionWidget = this.f20172a;
            String str = aVar2.f9365b;
            C89219l.m154716b(str, "");
            definitionSelectionWidget.mo14362a(str);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.DefinitionSelectionWidget$e */
    static final class C8137e extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ DefinitionSelectionWidget f20173a;

        static {
            Covode.recordClassIndex(8949);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8137e(DefinitionSelectionWidget definitionSelectionWidget) {
            super(1);
            this.f20173a = definitionSelectionWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            String str2 = str;
            C89219l.m154721d(str2, "");
            C3854a.m9453a(4, "DefinitionSelectionWidget", "onResolutionDegrade. newResolution=".concat(String.valueOf(str2)));
            this.f20173a.mo14362a(str2);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        View view = getView();
        if (view != null) {
            view.setOnClickListener(this);
        }
        this.f20169b = (ImageView) getView();
    }

    public final void onClick(View view) {
        Context context;
        AbstractC4051b bVar = (AbstractC4051b) C6193a.m13435a(AbstractC4051b.class);
        Activity activity = null;
        if (view != null && (context = view.getContext()) != null) {
            while (true) {
                if (!(context instanceof Activity)) {
                    if (context instanceof ContextWrapper) {
                        context = ((ContextWrapper) context).getBaseContext();
                        if (context == null) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    activity = (Activity) context;
                    break;
                }
            }
        }
        bVar.showDefinitionSelectionDialog(activity, false);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.DefinitionSelectionWidget$b */
    static final class C8134b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ DefinitionSelectionWidget f20170a;

        static {
            Covode.recordClassIndex(8946);
        }

        C8134b(DefinitionSelectionWidget definitionSelectionWidget) {
            this.f20170a = definitionSelectionWidget;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C8454g gVar = (C8454g) obj;
            String str = "";
            C89219l.m154721d(gVar, str);
            SparseBooleanArray sparseBooleanArray = gVar.f20901a;
            DefinitionSelectionWidget definitionSelectionWidget = this.f20170a;
            boolean z = false;
            if (sparseBooleanArray != null) {
                boolean z2 = sparseBooleanArray.get(0);
                boolean z3 = sparseBooleanArray.get(2);
                if (z2 || z3) {
                    z = true;
                    C7573e.m15564a(definitionSelectionWidget.context, definitionSelectionWidget.getView(), !z, gVar.f20903c);
                }
            }
            String valueOf = String.valueOf(definitionSelectionWidget.dataChannel.mo28318b(C9096dh.class));
            EnumC11728i iVar = (EnumC11728i) definitionSelectionWidget.dataChannel.mo28318b(C9058bx.class);
            if (iVar != null) {
                str = C11729j.m20684a(iVar);
            }
            ((AbstractC4051b) C6193a.m13435a(AbstractC4051b.class)).reportAudienceDefinitionBtnShow(valueOf, str, "1");
            C7573e.m15564a(definitionSelectionWidget.context, definitionSelectionWidget.getView(), !z, gVar.f20903c);
        }
    }

    /* renamed from: a */
    public final void mo14362a(String str) {
        int hashCode = str.hashCode();
        int i = 2131234478;
        if (hashCode != -1008619738) {
            if (hashCode != 3324) {
                if (hashCode != 3448) {
                    if (hashCode != 3665) {
                        if (hashCode == 115761) {
                            str.equals("uhd");
                        }
                    } else if (str.equals("sd")) {
                        i = 2131234480;
                    }
                } else if (str.equals("ld")) {
                    i = 2131234479;
                }
            } else if (str.equals("hd")) {
                i = 2131234481;
            }
        } else if (str.equals("origin")) {
            i = 2131234482;
        }
        ImageView imageView = this.f20169b;
        if (imageView != null) {
            imageView.setImageResource(i);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        String g;
        ((AbstractC11181z) C6779a.m14563a().mo13052a(C8454g.class).mo143274a(WidgetExtendsKt.autoDispose(this))).mo17949a(new C8134b(this));
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.mo28309a((AbstractC1204m) this, C9034ba.class, (AbstractC89172b) new C8135c(this)).mo28309a((AbstractC1204m) this, C9127i.class, (AbstractC89172b) new C8136d(this)).mo28309a((AbstractC1204m) this, C9126h.class, (AbstractC89172b) new C8137e(this));
        }
        C11870f fVar = C11870f.C11871a.f28404a;
        String str = "";
        C89219l.m154716b(fVar, str);
        EnterRoomLinkSession a = fVar.mo19010a();
        C89219l.m154716b(a, str);
        String str2 = a.f28391b.f28233c.f28288E;
        if (str2 == null) {
            str2 = str;
        }
        AbstractC2953a a2 = C6193a.m13435a(AbstractC4357d.class);
        C89219l.m154716b(a2, str);
        AbstractC5777j b = ((AbstractC4357d) a2).getLivePlayControllerManager().mo11553b(str2);
        if (!(b == null || (g = b.mo11547g()) == null)) {
            str = g;
        }
        mo14362a(str);
    }
}
