package com.p2082ss.android.ugc.aweme.tools.draft;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.app.ActivityC0580d;
import androidx.core.p037h.C0792v;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1836h.C24117a;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.tools.C78099c;
import com.p2082ss.android.ugc.aweme.tools.draft.DraftItemView;
import com.p2082ss.android.ugc.aweme.tools.draft.p4100a.AbstractC78124a;
import com.p2082ss.android.ugc.aweme.utils.C80564i;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.tools.view.p4366e.ProgressDialogC84958b;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.AwemeDraftViewHolder */
public class AwemeDraftViewHolder extends AbstractC78124a<C43223c> implements WeakHandler.IHandler, AbstractC33974au {

    /* renamed from: a */
    ExpandableMentionTextView f175398a;

    /* renamed from: b */
    ViewGroup f175399b;

    /* renamed from: c */
    TextView f175400c;

    /* renamed from: d */
    TextView f175401d;

    /* renamed from: e */
    ImageView f175402e;

    /* renamed from: f */
    public SimpleDraweeView f175403f;

    /* renamed from: g */
    View f175404g;

    /* renamed from: h */
    ImageView f175405h;

    /* renamed from: i */
    AppCompatCheckBox f175406i;

    /* renamed from: j */
    DraftItemView f175407j;

    /* renamed from: k */
    Space f175408k;

    /* renamed from: l */
    RelativeLayout f175409l;

    /* renamed from: m */
    public boolean f175410m;

    /* renamed from: n */
    public boolean f175411n;

    /* renamed from: o */
    AbstractC78113a f175412o;

    /* renamed from: p */
    Context f175413p;

    /* renamed from: q */
    long f175414q;

    /* renamed from: r */
    Map<ImageView, C24117a<AbstractC24454c>> f175415r;

    /* renamed from: s */
    public boolean f175416s;

    /* renamed from: w */
    private Space f175417w;

    /* renamed from: x */
    private ProgressDialogC84958b f175418x;

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.AwemeDraftViewHolder$a */
    public interface AbstractC78113a {
        static {
            Covode.recordClassIndex(91220);
        }

        /* renamed from: a */
        void mo122028a(int i, C43223c cVar);

        /* renamed from: a */
        void mo122029a(View view, C43223c cVar);
    }

    static {
        Covode.recordClassIndex(91217);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        Context context = this.f175413p;
        Intent intent = (Intent) message.obj;
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
        ProgressDialogC84958b bVar = this.f175418x;
        if (bVar != null && bVar.isShowing()) {
            this.f175418x.dismiss();
            this.f175418x = null;
        }
    }

    /* renamed from: a */
    public static boolean m136560a(ImageView imageView, Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return false;
        }
        imageView.setImageBitmap(bitmap);
        return true;
    }

    AwemeDraftViewHolder(View view, Map<ImageView, C24117a<AbstractC24454c>> map, AbstractC78113a aVar) {
        super(view);
        this.f175398a = (ExpandableMentionTextView) C0792v.m2762c(view, (int) R.id.p9);
        this.f175399b = (ViewGroup) C0792v.m2762c(view, (int) R.id.cet);
        this.f175400c = (TextView) C0792v.m2762c(view, (int) R.id.evf);
        this.f175401d = (TextView) C0792v.m2762c(view, (int) R.id.p0);
        this.f175402e = (ImageView) C0792v.m2762c(view, (int) R.id.a3h);
        this.f175403f = (SimpleDraweeView) C0792v.m2762c(view, (int) R.id.afn);
        this.f175404g = C0792v.m2762c(view, (int) R.id.eu7);
        this.f175405h = (ImageView) C0792v.m2762c(view, (int) R.id.aop);
        this.f175406i = (AppCompatCheckBox) C0792v.m2762c(view, (int) R.id.a4l);
        DraftItemView draftItemView = (DraftItemView) C0792v.m2762c(view, (int) R.id.ccp);
        this.f175407j = draftItemView;
        draftItemView.setOnScrollListener(new DraftItemView.AbstractC78114a() {
            /* class com.p2082ss.android.ugc.aweme.tools.draft.AwemeDraftViewHolder.C781111 */

            static {
                Covode.recordClassIndex(91218);
            }

            @Override // com.p2082ss.android.ugc.aweme.tools.draft.DraftItemView.AbstractC78114a
            /* renamed from: a */
            public final void mo122027a(int i, boolean z) {
                int i2;
                int i3;
                AwemeDraftViewHolder awemeDraftViewHolder = AwemeDraftViewHolder.this;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) awemeDraftViewHolder.f175399b.getLayoutParams();
                int i4 = 1;
                if (C78099c.m136517a(awemeDraftViewHolder.f175398a.getContext())) {
                    int i5 = marginLayoutParams.leftMargin;
                    if (z) {
                        i4 = -1;
                    }
                    i2 = i5 + (i * i4);
                    i3 = marginLayoutParams.rightMargin;
                } else {
                    i2 = marginLayoutParams.leftMargin;
                    int i6 = marginLayoutParams.rightMargin;
                    if (!z) {
                        i4 = -1;
                    }
                    i3 = (i * i4) + i6;
                }
                marginLayoutParams.leftMargin = i2;
                marginLayoutParams.rightMargin = i3;
                awemeDraftViewHolder.f175399b.setLayoutParams(marginLayoutParams);
            }
        });
        this.f175408k = (Space) C0792v.m2762c(view, (int) R.id.aoo);
        this.f175417w = (Space) C0792v.m2762c(view, (int) R.id.aon);
        RelativeLayout relativeLayout = (RelativeLayout) C0792v.m2762c(view, (int) R.id.aok);
        this.f175409l = relativeLayout;
        relativeLayout.setOnClickListener(new View$OnClickListenerC78429u(this));
        this.f175409l.setOnLongClickListener(new View$OnLongClickListenerC78430v(this));
        this.f175412o = aVar;
        Context context = view.getContext();
        this.f175413p = context;
        Activity a = C80564i.m139647a(context);
        if (a instanceof ActivityC0945e) {
            ((ActivityC0580d) a).getLifecycle().mo4012a(this);
        }
        this.f175415r = map;
    }
}
