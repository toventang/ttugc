package com.p2082ss.android.ugc.aweme.tools.draft;

import android.app.Activity;
import android.app.Application;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.ActivityC0580d;
import androidx.core.p037h.C0792v;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxCheckBox;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.experiment.C46786cc;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.p2730de.C40970e;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.C70747dv;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.VideoRecordPermissionActivity;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.tools.draft.p4100a.AbstractC78124a;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.aweme.utils.C80564i;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.ugc.tools.view.p4366e.ProgressDialogC84958b;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.AwemeDraftNewViewHolder */
public class AwemeDraftNewViewHolder extends AbstractC78124a<C43223c> implements WeakHandler.IHandler, AbstractC33974au {

    /* renamed from: a */
    TextView f175377a;

    /* renamed from: b */
    TuxCheckBox f175378b;

    /* renamed from: c */
    public boolean f175379c;

    /* renamed from: d */
    public boolean f175380d;

    /* renamed from: e */
    final AbstractC78110a f175381e;

    /* renamed from: f */
    final Context f175382f;

    /* renamed from: g */
    long f175383g;

    /* renamed from: h */
    final Map<ImageView, C24117a<AbstractC24454c>> f175384h;

    /* renamed from: i */
    TuxTextView f175385i;

    /* renamed from: j */
    TuxTextView f175386j;

    /* renamed from: k */
    ViewGroup f175387k;

    /* renamed from: l */
    ViewGroup f175388l;

    /* renamed from: m */
    final int f175389m;

    /* renamed from: n */
    private ProgressDialogC84958b f175390n;

    /* renamed from: o */
    private View f175391o;

    /* renamed from: p */
    private ViewGroup f175392p;

    /* renamed from: q */
    private TuxIconView f175393q;

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.AwemeDraftNewViewHolder$a */
    public interface AbstractC78110a {
        static {
            Covode.recordClassIndex(91216);
        }

        /* renamed from: a */
        void mo122025a(int i, C43223c cVar);

        /* renamed from: a */
        void mo122026a(View view, C43223c cVar);
    }

    static {
        Covode.recordClassIndex(91213);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        m136553a(this.f175382f, (Intent) message.obj);
        ProgressDialogC84958b bVar = this.f175390n;
        if (bVar != null && bVar.isShowing()) {
            this.f175390n.dismiss();
            this.f175390n = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo122023a(C43223c cVar) {
        if (C46786cc.m90132a()) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(20);
            int b = (int) C13628n.m24520b(this.itemView.getContext(), 4.0f);
            int b2 = (int) C13628n.m24520b(this.itemView.getContext(), 6.0f);
            layoutParams.setMargins(b, b2, b, b2);
            this.f175392p.setLayoutParams(layoutParams);
            this.f175393q.setIconRes(R.raw.icon_music_note);
            this.f175393q.setTintColorRes(R.attr.aa);
            this.f175386j.setMaxLines(1);
            this.f175386j.setMinTextSize(13.0f);
            this.f175386j.setTuxFont(62);
            this.f175386j.setText(cVar.f100906f.musicName);
        } else {
            this.f175393q.setIconRes(R.raw.icon_video);
            this.f175393q.setTintColorRes(R.attr.aa);
            this.f175386j.setMaxLines(2);
            this.f175386j.setMinTextSize(10.0f);
            Display defaultDisplay = ((WindowManager) m136552a(C63247i.f143610a, "window")).getDefaultDisplay();
            Point point = new Point();
            int i = Build.VERSION.SDK_INT;
            defaultDisplay.getRealSize(point);
            int b3 = (point.x / 3) - ((int) C13628n.m24520b(this.itemView.getContext(), 34.0f));
            TextPaint paint = this.f175386j.getPaint();
            String string = this.f175382f.getString(R.string.bcw);
            this.f175386j.setText(R.string.bcw);
            this.f175386j.setTuxFont(92);
            float f = (float) b3;
            if (paint.measureText(string) > f) {
                this.f175386j.setTuxFont(92);
            } else {
                this.f175386j.setTuxFont(62);
            }
            String[] split = string.split(" ");
            if (paint.measureText(string) > f) {
                try {
                    String str = split[0];
                    int i2 = 0;
                    for (int i3 = 1; i3 < split.length; i3++) {
                        if (paint.measureText(str + " " + split[i3]) <= f) {
                            str = str + " " + split[i3];
                        } else {
                            i2 = i3;
                        }
                    }
                    String str2 = split[i2];
                    for (int i4 = i2 + 1; i4 < split.length; i4++) {
                        str2 = str2 + " " + split[i4];
                    }
                    this.f175386j.setWidth((int) (Math.max(paint.measureText(str), paint.measureText(str2)) + 1.0f));
                } catch (IndexOutOfBoundsException | NullPointerException e) {
                    e.printStackTrace();
                }
            }
        }
        this.f175386j.setVisibility(0);
        this.f175387k.setVisibility(0);
    }

    /* renamed from: a */
    private static void m136553a(Context context, Intent intent) {
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }

    /* renamed from: a */
    public static boolean m136555a(ImageView imageView, Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return false;
        }
        imageView.setImageBitmap(bitmap);
        return true;
    }

    /* renamed from: a */
    private static Object m136552a(Application application, String str) {
        Object obj;
        MethodCollector.m26663i(12534);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = application.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = application.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = application.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(12534);
                }
            }
        } else {
            obj = application.getSystemService(str);
        }
        return obj;
    }

    AwemeDraftNewViewHolder(View view, Map<ImageView, C24117a<AbstractC24454c>> map, AbstractC78110a aVar) {
        super(view);
        Context context = view.getContext();
        this.f175382f = context;
        this.f175389m = (C70636dh.m124831b(context) - (((int) C13628n.m24520b(context, 1.0f)) * 2)) / 3;
        this.f175391o = view.findViewById(R.id.acf);
        this.f175454u = (SmartImageView) view.findViewById(R.id.afn);
        this.f175386j = (TuxTextView) view.findViewById(R.id.f18);
        this.f175385i = (TuxTextView) view.findViewById(R.id.f6_);
        this.f175387k = (ViewGroup) view.findViewById(R.id.fcx);
        this.f175392p = (ViewGroup) view.findViewById(R.id.eg0);
        this.f175377a = (TextView) C0792v.m2762c(view, (int) R.id.evf);
        this.f175388l = (ViewGroup) C0792v.m2762c(view, (int) R.id.e1l);
        this.f175378b = (TuxCheckBox) C0792v.m2762c(view, (int) R.id.a4l);
        this.f175393q = (TuxIconView) view.findViewById(R.id.byw);
        this.f175391o.setOnClickListener(new View$OnClickListenerC78423o(this));
        this.f175391o.setOnLongClickListener(new View$OnLongClickListenerC78424p(this));
        this.f175381e = aVar;
        Activity a = C80564i.m139647a(context);
        if (a instanceof ActivityC0945e) {
            ((ActivityC0580d) a).getLifecycle().mo4012a(this);
        }
        this.f175384h = map;
    }

    /* renamed from: a */
    public static void m136554a(Context context, String str, String str2, int i, String str3, boolean z) {
        String uuid = UUID.randomUUID().toString();
        ArrayList<String> a = C75466g.m132343a(str3);
        C84425b a2 = new C84425b().mo129406a("creation_id", uuid).mo129406a("shoot_way", "draft_again").mo129406a("shoot_entrance", "draft_again").mo129406a("enter_method", "draft_again").mo129406a("music_id", str).mo129407a("is_ui_shoot", false).mo129406a("group_id", C70747dv.m124972a());
        if (!C84904k.m145909a(a) && !TextUtils.isEmpty(a.get(0))) {
            a2.mo129406a("prop_id", a.get(0));
        }
        C80322d.m139251a("shoot", a2.f188764a);
        C40970e.m82485a("toVideoActivity() called with: context = [ ], path = [" + str2 + "], musicStart = [" + i + "]");
        Intent intent = new Intent();
        intent.putExtra("path", str2);
        intent.putExtra("music_start", i);
        intent.putExtra("record_from", 1);
        intent.putExtra("draft_music_legal", z);
        intent.putExtra("translation_type", 3);
        intent.putExtra("shoot_way", "draft_again");
        intent.putExtra("creation_id", uuid);
        intent.putExtra("extra_sticker_from", "draft");
        intent.putStringArrayListExtra("reuse_sticker_ids", C75466g.m132343a(str3));
        C70005cr.m123611a().mo110456f();
        intent.setClass(context, VideoRecordPermissionActivity.class);
        m136553a(context, intent);
    }
}
