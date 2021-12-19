package com.bytedance.android.livesdk.utils.crop;

import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.AbstractC0952i;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.chatroom.p488c.C7379al;
import com.bytedance.android.livesdk.utils.crop.CropView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.C17846f;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.utils.crop.a */
public final class C11256a extends AbstractC11293v {

    /* renamed from: b */
    public static final C11257a f26942b = new C11257a((byte) 0);

    /* renamed from: a */
    public AbstractC89172b<? super String, C89391z> f26943a;

    /* renamed from: c */
    private Uri f26944c;

    /* renamed from: d */
    private String f26945d;

    /* renamed from: e */
    private long f26946e = Long.MIN_VALUE;

    /* renamed from: f */
    private HashMap f26947f;

    static {
        Covode.recordClassIndex(12888);
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a */
    public final void mo8165a() {
        HashMap hashMap = this.f26947f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a_ */
    public final View mo8166a_(int i) {
        if (this.f26947f == null) {
            this.f26947f = new HashMap();
        }
        View view = (View) this.f26947f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f26947f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo8165a();
    }

    /* renamed from: com.bytedance.android.livesdk.utils.crop.a$a */
    public static final class C11257a {
        static {
            Covode.recordClassIndex(12889);
        }

        private C11257a() {
        }

        public /* synthetic */ C11257a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C11256a m19949a(Uri uri) {
            C89219l.m154721d(uri, "");
            C11256a aVar = new C11256a();
            Bundle bundle = new Bundle();
            bundle.putParcelable("arg_origin_uri", uri);
            aVar.setArguments(bundle);
            return aVar;
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: b */
    public final AbstractC11293v.C11295b mo8355b() {
        AbstractC11293v.C11295b bVar = new AbstractC11293v.C11295b(R.layout.b8_);
        bVar.f27022i = -1;
        return bVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f26946e != Long.MIN_VALUE) {
            C3868c.m9488a("ttlive_crop_fragment_all", 0, SystemClock.elapsedRealtime() - this.f26946e);
            this.f26946e = Long.MIN_VALUE;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.utils.crop.a$b */
    static final class View$OnClickListenerC11258b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C11256a f26948a;

        static {
            Covode.recordClassIndex(12890);
        }

        View$OnClickListenerC11258b(C11256a aVar) {
            this.f26948a = aVar;
        }

        public final void onClick(View view) {
            this.f26948a.dismiss();
        }
    }

    /* renamed from: a */
    public final void mo18026a(AbstractC89172b<? super String, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        this.f26943a = bVar;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DataChannel a = C17846f.m33055a(this);
        if (a != null) {
            a.mo28315b(C7379al.class, (Object) true);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DataChannel a = C17846f.m33055a(this);
        if (a != null) {
            a.mo28315b(C7379al.class, (Object) false);
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f26944c = (Uri) arguments.getParcelable("arg_origin_uri");
            this.f26945d = arguments.getString("arg_origin_path");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.utils.crop.a$c */
    static final class View$OnClickListenerC11259c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C11256a f26949a;

        static {
            Covode.recordClassIndex(12891);
        }

        View$OnClickListenerC11259c(C11256a aVar) {
            this.f26949a = aVar;
        }

        public final void onClick(View view) {
            AbstractC89172b<? super String, C89391z> bVar = this.f26949a.f26943a;
            if (bVar != null) {
                CropView cropView = (CropView) this.f26949a.mo8166a_(R.id.age);
                C89219l.m154721d(bVar, "");
                PinchImageView pinchImageView = cropView.f26888a;
                if (pinchImageView == null) {
                    C89219l.m154710a("mCoverImage");
                }
                if (pinchImageView.getPinchMode() == 0) {
                    C1731i.m5640b(new CropView.CallableC11242e(cropView), C1731i.f5562a).mo5534a(new CropView.C11243f(bVar), C1731i.f5564c, null);
                }
            }
            this.f26949a.dismiss();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v
    public final void show(AbstractC0952i iVar, String str) {
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(str, "");
        this.f26946e = SystemClock.elapsedRealtime();
        super.show(iVar, str);
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        CropView cropView = (CropView) mo8166a_(R.id.age);
        String str = this.f26945d;
        if (str != null) {
            cropView.setOriginPath(str);
        } else {
            cropView.setOriginUri(this.f26944c);
        }
        ((ImageView) mo8166a_(R.id.et6)).setOnClickListener(new View$OnClickListenerC11258b(this));
        ((ImageView) mo8166a_(R.id.eu2)).setOnClickListener(new View$OnClickListenerC11259c(this));
    }
}
