package com.p2082ss.android.ugc.aweme.livewallpaper.p3420ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.input.TuxSwitch;
import com.bytedance.tux.input.slider.TuxSlider;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.experiment.C46994gu;
import com.p2082ss.android.ugc.aweme.experiment.C47014hj;
import com.p2082ss.android.ugc.aweme.livewallpaper.AmeLiveWallpaper;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3416d.C58882c;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.AbstractC58894c;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.C58901f;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.C58905h;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.C58908j;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.ui.p */
public final class C58933p {

    /* renamed from: a */
    public C23226a f134159a;

    static {
        Covode.recordClassIndex(69252);
    }

    /* renamed from: com.ss.android.ugc.aweme.livewallpaper.ui.p$b */
    public static final class C58935b implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ C58933p f134161a;

        /* renamed from: b */
        final /* synthetic */ SeekBar.OnSeekBarChangeListener f134162b;

        /* renamed from: c */
        final /* synthetic */ String f134163c;

        /* renamed from: d */
        final /* synthetic */ TuxSlider f134164d;

        static {
            Covode.recordClassIndex(69254);
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
            C89219l.m154721d(seekBar, "");
            SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f134162b;
            if (onSeekBarChangeListener != null) {
                onSeekBarChangeListener.onStartTrackingTouch(seekBar);
            }
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
            C89219l.m154721d(seekBar, "");
            SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f134162b;
            if (onSeekBarChangeListener != null) {
                onSeekBarChangeListener.onStopTrackingTouch(seekBar);
            }
            String str = this.f134163c;
            TuxSlider tuxSlider = this.f134164d;
            C89219l.m154716b(tuxSlider, "");
            int progress = tuxSlider.getProgress();
            C89219l.m154721d(str, "");
            C39162r.m79460a("adjust_wallpaper_volume", new C33744d().mo59980a("progress", progress).mo59983a("enter_from", str).f79943a);
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            C89219l.m154721d(seekBar, "");
            SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f134162b;
            if (onSeekBarChangeListener != null) {
                onSeekBarChangeListener.onProgressChanged(seekBar, i, z);
            }
        }

        C58935b(C58933p pVar, SeekBar.OnSeekBarChangeListener onSeekBarChangeListener, String str, TuxSlider tuxSlider) {
            this.f134161a = pVar;
            this.f134162b = onSeekBarChangeListener;
            this.f134163c = str;
            this.f134164d = tuxSlider;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.livewallpaper.ui.p$d */
    public static final class View$OnClickListenerC58937d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C58933p f134167a;

        static {
            Covode.recordClassIndex(69256);
        }

        View$OnClickListenerC58937d(C58933p pVar) {
            this.f134167a = pVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C23226a aVar = this.f134167a.f134159a;
            if (aVar != null) {
                aVar.dismiss();
            }
        }
    }

    /* renamed from: a */
    private static void m108261a(String str) {
        C39162r.m79460a("wallpaper_preferences_dialog_show", new C33744d().mo59983a("enter_from", str).f79943a);
    }

    /* renamed from: com.ss.android.ugc.aweme.livewallpaper.ui.p$e */
    public static final class DialogInterface$OnDismissListenerC58938e implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ TuxSwitch f134168a;

        /* renamed from: b */
        final /* synthetic */ TuxSlider f134169b;

        static {
            Covode.recordClassIndex(69257);
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            MethodCollector.m26663i(3834);
            TuxSwitch tuxSwitch = this.f134168a;
            C89219l.m154716b(tuxSwitch, "");
            boolean isChecked = tuxSwitch.isChecked();
            TuxSlider tuxSlider = this.f134169b;
            C89219l.m154716b(tuxSlider, "");
            int progress = tuxSlider.getProgress();
            C58905h.m108240a(isChecked);
            C58905h.m108239a(progress);
            if (C58901f.m108237d()) {
                Bundle bundle = new Bundle();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C58908j.f134100g, isChecked);
                jSONObject.put(C58908j.f134101h, progress);
                String jSONObject2 = jSONObject.toString();
                C89219l.m154716b(jSONObject2, "");
                bundle.putString("wallpaper_preferences", jSONObject2);
                try {
                    C17867d.m33078a().getContentResolver().call(AbstractC58894c.f134068c, "update_preferences", "", bundle);
                    MethodCollector.m26664o(3834);
                } catch (Throwable unused) {
                    MethodCollector.m26664o(3834);
                }
            } else {
                Context a = C17867d.m33078a();
                if (a != null && C58901f.m108228a(a, a.getPackageName())) {
                    Intent intent = new Intent();
                    intent.setClass(a, AmeLiveWallpaper.class);
                    intent.putExtra("action", "action_update_volume");
                    C58882c.m108180a(a, intent);
                }
                MethodCollector.m26664o(3834);
            }
        }

        DialogInterface$OnDismissListenerC58938e(TuxSwitch tuxSwitch, TuxSlider tuxSlider) {
            this.f134168a = tuxSwitch;
            this.f134169b = tuxSlider;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.livewallpaper.ui.p$a */
    public static final class View$OnTouchListenerC58934a implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ C79459a f134160a;

        static {
            Covode.recordClassIndex(69253);
        }

        View$OnTouchListenerC58934a(C79459a aVar) {
            this.f134160a = aVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            this.f134160a.mo123053a();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.livewallpaper.ui.p$c */
    public static final class C58936c implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C58933p f134165a;

        /* renamed from: b */
        final /* synthetic */ String f134166b;

        static {
            Covode.recordClassIndex(69255);
        }

        C58936c(C58933p pVar, String str) {
            this.f134165a = pVar;
            this.f134166b = str;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            C39162r.m79460a("click_double_tap_to_pause_switch", new C33744d().mo59980a("action", z ? 1 : 0).mo59983a("enter_from", this.f134166b).f79943a);
        }
    }

    /* renamed from: a */
    public final void mo96385a(Context context, boolean z, String str, SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        MethodCollector.m26663i(4003);
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        View inflate = View.inflate(context, R.layout.bjm, null);
        TuxSwitch tuxSwitch = (TuxSwitch) inflate.findViewById(R.id.czp);
        TuxSlider tuxSlider = (TuxSlider) inflate.findViewById(R.id.e4d);
        Group group = (Group) inflate.findViewById(R.id.ef8);
        Group group2 = (Group) inflate.findViewById(R.id.e4a);
        View findViewById = inflate.findViewById(R.id.amk);
        if (!C46994gu.m90274a(context)) {
            C89219l.m154716b(group, "");
            group.setVisibility(8);
            C89219l.m154716b(findViewById, "");
            findViewById.setVisibility(8);
        } else if (!C47014hj.m90285a(context)) {
            C89219l.m154716b(group2, "");
            group2.setVisibility(8);
            C89219l.m154716b(findViewById, "");
            findViewById.setVisibility(8);
        }
        C89219l.m154716b(tuxSwitch, "");
        tuxSwitch.setChecked(C58905h.m108245e());
        C89219l.m154716b(tuxSlider, "");
        tuxSlider.setProgress(C58905h.m108246f());
        tuxSlider.setOnSeekBarChangeListener(new C58935b(this, onSeekBarChangeListener, str, tuxSlider));
        tuxSwitch.setOnCheckedChangeListener(new C58936c(this, str));
        C89219l.m154716b(group2, "");
        if (group2.getVisibility() == 0 && z) {
            tuxSlider.setAlpha(0.75f);
            tuxSlider.setEnabled(false);
            C79459a a = new C79459a(C17867d.m33078a()).mo123050a(R.string.haw);
            View findViewById2 = inflate.findViewById(R.id.coz);
            findViewById2.setOnTouchListener(new View$OnTouchListenerC58934a(a));
            findViewById2.setVisibility(0);
        }
        inflate.findViewById(R.id.a77).setOnClickListener(new View$OnClickListenerC58937d(this));
        C23226a.C23227a aVar = new C23226a.C23227a();
        C89219l.m154716b(inflate, "");
        C23226a aVar2 = aVar.mo37816a(inflate).mo37812a(1).mo37819a(true).mo37815a(new DialogInterface$OnDismissListenerC58938e(tuxSwitch, tuxSlider)).f55057a;
        this.f134159a = aVar2;
        if (aVar2 != null) {
            aVar2.show(((ActivityC0945e) context).getSupportFragmentManager(), "");
        }
        m108261a(str);
        MethodCollector.m26664o(4003);
    }
}
