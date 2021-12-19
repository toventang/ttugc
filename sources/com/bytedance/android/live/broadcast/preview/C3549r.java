package com.bytedance.android.live.broadcast.preview;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import com.bytedance.android.live.broadcast.C3228f;
import com.bytedance.android.live.broadcast.C3802x;
import com.bytedance.android.live.broadcast.C3804z;
import com.bytedance.android.live.broadcast.model.C3263i;
import com.bytedance.android.live.broadcast.model.C3267k;
import com.bytedance.android.live.broadcast.model.EnumC3268l;
import com.bytedance.android.live.core.p218f.C3888a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.C4031a;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.preview.r */
public final class C3549r {

    /* renamed from: a */
    public static final C3549r f9854a = new C3549r();

    private C3549r() {
    }

    static {
        Covode.recordClassIndex(4033);
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.r$a */
    static final class C3550a extends AbstractC89220m implements AbstractC89172b<EnumC11728i, C89391z> {

        /* renamed from: a */
        final /* synthetic */ Context f9855a;

        /* renamed from: b */
        final /* synthetic */ DataChannel f9856b;

        static {
            Covode.recordClassIndex(4034);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3550a(Context context, DataChannel dataChannel) {
            super(1);
            this.f9855a = context;
            this.f9856b = dataChannel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(EnumC11728i iVar) {
            C89219l.m154721d(iVar, "");
            C3549r.m8949a(this.f9855a, this.f9856b);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.r$b */
    static final class C3551b extends AbstractC89220m implements AbstractC89172b<Map<String, ? extends C3263i.C3264a>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ Context f9857a;

        /* renamed from: b */
        final /* synthetic */ DataChannel f9858b;

        static {
            Covode.recordClassIndex(4035);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3551b(Context context, DataChannel dataChannel) {
            super(1);
            this.f9857a = context;
            this.f9858b = dataChannel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Map<String, ? extends C3263i.C3264a> map) {
            C89219l.m154721d(map, "");
            C3549r.m8949a(this.f9857a, this.f9858b);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.r$c */
    public static final class C3552c extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ DataChannel f9859a;

        /* renamed from: b */
        final /* synthetic */ String f9860b;

        /* renamed from: c */
        final /* synthetic */ Context f9861c;

        static {
            Covode.recordClassIndex(4036);
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            DataChannel dataChannel = this.f9859a;
            String str = this.f9860b;
            C89219l.m154716b(str, "");
            DialogInterface$OnCancelListenerC0944d a = C3560u.m8960a(dataChannel, str);
            if (a != null) {
                C4031a.m9839a(C3888a.m9506b(this.f9861c), a);
            }
            DataChannel dataChannel2 = this.f9859a;
            String str2 = this.f9860b;
            C89219l.m154716b(str2, "");
            C3560u.m8962b(dataChannel2, str2);
        }

        C3552c(DataChannel dataChannel, String str, Context context) {
            this.f9859a = dataChannel;
            this.f9860b = str;
            this.f9861c = context;
        }
    }

    /* renamed from: a */
    public static void m8949a(Context context, DataChannel dataChannel) {
        C3263i.C3264a aVar;
        int i;
        C3263i.C3264a aVar2;
        Object b = dataChannel.mo28318b(C3802x.class);
        if (b == null) {
            C89219l.m154715b();
        }
        String modeFromServer = ((EnumC11728i) b).getModeFromServer();
        Map map = (Map) dataChannel.mo28318b(C3804z.class);
        if (map == null || (aVar = (C3263i.C3264a) map.get(modeFromServer)) == null || aVar.f9349h != 2) {
            dataChannel.mo28320c(C3228f.class, new C3267k(EnumC3268l.COLD_DOWN_BLOCK));
            return;
        }
        Map map2 = (Map) dataChannel.mo28318b(C3804z.class);
        if (map2 == null || (aVar2 = (C3263i.C3264a) map2.get(modeFromServer)) == null) {
            i = 0;
        } else {
            i = aVar2.f9346e;
        }
        SpannableString spannableString = new SpannableString(C3966y.m9659a(R.plurals.fu, i, Integer.valueOf(i)));
        spannableString.setSpan(new C3552c(dataChannel, modeFromServer, context), 0, spannableString.length(), 17);
        dataChannel.mo28320c(C3228f.class, new C3267k(0, EnumC3268l.COLD_DOWN_BLOCK, spannableString));
    }
}
