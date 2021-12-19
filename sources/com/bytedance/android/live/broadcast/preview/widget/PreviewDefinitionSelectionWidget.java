package com.bytedance.android.live.broadcast.preview.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.broadcast.model.C3270n;
import com.bytedance.android.live.broadcast.model.C3272o;
import com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.p229d.AbstractC4051b;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p561j.C9094df;
import com.bytedance.android.livesdk.p561j.C9140v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public final class PreviewDefinitionSelectionWidget extends PreviewToolBaseWidget implements AbstractC33974au {

    /* renamed from: a */
    public static final C3592a f9936a = new C3592a((byte) 0);

    static {
        Covode.recordClassIndex(4086);
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    /* renamed from: a */
    public final int mo8870a() {
        return R.string.dt3;
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    /* renamed from: b */
    public final int mo8872b() {
        return 2131234426;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewDefinitionSelectionWidget$a */
    public static final class C3592a {
        static {
            Covode.recordClassIndex(4087);
        }

        private C3592a() {
        }

        public /* synthetic */ C3592a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
        AbstractC4051b bVar = (AbstractC4051b) C6193a.m13435a(AbstractC4051b.class);
        if (bVar != null) {
            bVar.reportAnchorDefinitionBtnShow();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        C3270n.C3271a c = m9012c();
        if (c != null) {
            m9011a(c);
        }
        this.dataChannel.mo28314b(C9094df.class, (AbstractC89172b) new C3593b(this));
        DataChannelGlobal.f42558d.mo28322a(this, this, C9140v.class, new C3594c(this));
    }

    /* renamed from: c */
    public static C3270n.C3271a m9012c() {
        boolean z;
        C3270n.C3271a aVar;
        String str;
        C6805b<Map<String, String>> bVar = AbstractC6804a.f17021cQ;
        C89219l.m154716b(bVar, "");
        Map<String, String> a = bVar.mo13066a();
        if (a == null || a.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        String str2 = null;
        if (!z) {
            aVar = new C3270n.C3271a();
            aVar.f9364a = a.get(StringSet.name);
            aVar.f9365b = a.get("sdk_key");
        } else {
            aVar = null;
        }
        StringBuilder sb = new StringBuilder("getLastSpSelectedQuality. lastQuality.name=");
        if (aVar != null) {
            str = aVar.f9364a;
        } else {
            str = null;
        }
        StringBuilder append = sb.append(str).append(", lastQuality.sdkKey=");
        if (aVar != null) {
            str2 = aVar.f9365b;
        }
        C3854a.m9453a(4, "PreviewDefinitionSelectionWidget", append.append(str2).toString());
        return aVar;
    }

    /* renamed from: a */
    public static void m9011a(C3270n.C3271a aVar) {
        DataChannelGlobal.f42558d.mo28325b(C9140v.class, aVar);
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    /* renamed from: a */
    public final void mo8871a(View view) {
        Activity activity;
        C89219l.m154721d(view, "");
        AbstractC4051b bVar = (AbstractC4051b) C6193a.m13435a(AbstractC4051b.class);
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        while (true) {
            activity = null;
            if (context != null) {
                if (!(context instanceof Activity)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    activity = (Activity) context;
                    break;
                }
            } else {
                break;
            }
        }
        bVar.showDefinitionSelectionDialog(activity, true);
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewDefinitionSelectionWidget$b */
    static final class C3593b extends AbstractC89220m implements AbstractC89172b<C3272o, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PreviewDefinitionSelectionWidget f9937a;

        static {
            Covode.recordClassIndex(4088);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3593b(PreviewDefinitionSelectionWidget previewDefinitionSelectionWidget) {
            super(1);
            this.f9937a = previewDefinitionSelectionWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C3272o oVar) {
            List<C3270n.C3271a> list;
            C3270n nVar;
            C3272o oVar2 = oVar;
            C89219l.m154721d(oVar2, "");
            Map<Long, C3270n> map = oVar2.f9382q;
            C3270n.C3271a aVar = null;
            if (map == null || (nVar = map.get(4L)) == null) {
                list = null;
            } else {
                list = nVar.f9363b;
                List<C3270n.C3271a> list2 = nVar.f9363b;
                if (list2 != null) {
                    aVar = (C3270n.C3271a) C89070n.m154583g((List) list2);
                }
            }
            C3270n.C3271a c = PreviewDefinitionSelectionWidget.m9012c();
            if (c != null && list != null && !list.isEmpty()) {
                Iterator<C3270n.C3271a> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().f9365b.equals(c.f9365b)) {
                            PreviewDefinitionSelectionWidget.m9011a(c);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (aVar != null) {
                PreviewDefinitionSelectionWidget.m9011a(aVar);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewDefinitionSelectionWidget$c */
    static final class C3594c extends AbstractC89220m implements AbstractC89172b<C3270n.C3271a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PreviewDefinitionSelectionWidget f9938a;

        static {
            Covode.recordClassIndex(4089);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3594c(PreviewDefinitionSelectionWidget previewDefinitionSelectionWidget) {
            super(1);
            this.f9938a = previewDefinitionSelectionWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C3270n.C3271a aVar) {
            ImageView imageView;
            C3270n.C3271a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            PreviewDefinitionSelectionWidget previewDefinitionSelectionWidget = this.f9938a;
            String str = aVar2.f9365b;
            C89219l.m154716b(str, "");
            int hashCode = str.hashCode();
            int i = 2131234423;
            if (hashCode != -1008619738) {
                if (hashCode != 3324) {
                    if (hashCode != 3448) {
                        if (hashCode != 3665) {
                            if (hashCode == 115761) {
                                str.equals("uhd");
                            }
                        } else if (str.equals("sd")) {
                            i = 2131234425;
                        }
                    } else if (str.equals("ld")) {
                        i = 2131234424;
                    }
                } else if (str.equals("hd")) {
                    i = 2131234426;
                }
            } else if (str.equals("origin")) {
                i = 2131234427;
            }
            View view = previewDefinitionSelectionWidget.getView();
            if (!(view == null || (imageView = (ImageView) view.findViewById(R.id.fis)) == null)) {
                imageView.setImageResource(i);
            }
            return C89391z.f203057a;
        }
    }
}
