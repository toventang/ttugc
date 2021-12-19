package com.p2082ss.android.ugc.aweme.music.p3481ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.activity.processor.C33103x;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity */
public class EditOriginMusicTitleActivity extends ActivityC17312a implements EditOriginMusicTitlePresenter.AbstractC60840b {

    /* renamed from: a */
    public static final String f138582a = EditOriginMusicTitleActivity.class.getSimpleName();

    /* renamed from: b */
    TextTitleBar f138583b;

    /* renamed from: c */
    EditText f138584c;

    /* renamed from: d */
    ImageView f138585d;

    /* renamed from: e */
    public String f138586e;

    /* renamed from: f */
    public String f138587f;

    /* renamed from: g */
    public Activity f138588g;

    /* renamed from: h */
    public EditOriginMusicTitlePresenter f138589h;

    /* renamed from: i */
    ProgressDialog f138590i;

    /* renamed from: j */
    private final String f138591j = "[._ \\u0030-\\u0039\\u0041-\\u005A\\u005F\\u0061-\\u007A\\u00C0-\\u02B8\\u0370-\\u058F\\u0600-\\u077F\\u0900-\\u1DBF\\u1E00-\\u1FFF\\u2150-\\u218F\\u2C00-\\u2DDF\\u2E80-\\u2FDF\\u3040-\\u31FF\\u3400-\\u4DBF\\u4E00-\\uA6FF\\uA720-\\uABFF\\uAC00-\\uD7A3]+";

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    static {
        Covode.recordClassIndex(71679);
    }

    /* renamed from: b */
    private void m110634b() {
        ProgressDialog progressDialog = this.f138590i;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f138590i.dismiss();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter.AbstractC60840b
    /* renamed from: a */
    public final void mo98490a() {
        m110634b();
        Intent intent = new Intent();
        intent.putExtra("MUSIC_TITLE", this.f138586e);
        setResult(-1, intent);
        finish();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    public void onViewClicked(View view) {
        if (view.getId() == R.id.a6d) {
            this.f138584c.setText("");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter.AbstractC60840b
    /* renamed from: a */
    public final void mo98491a(String str) {
        m110634b();
        if (!TextUtils.isEmpty(str)) {
            new C79459a(this).mo123052a(str).mo123053a();
        }
    }

    /* renamed from: a */
    public final void mo98612a(boolean z) {
        if (z) {
            this.f138583b.getEndText().setTextColor(C0643b.m2378c(this.f138583b.getContext(), R.color.bh));
            this.f138583b.getEndText().setAlpha(1.0f);
            this.f138583b.getEndText().setClickable(true);
            return;
        }
        this.f138583b.getEndText().setTextColor(C0643b.m2378c(this.f138583b.getContext(), R.color.bz));
        this.f138583b.getEndText().setAlpha(0.5f);
        this.f138583b.getEndText().setClickable(false);
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity", "onCreate", true);
        C33103x xVar = new C33103x((byte) 0);
        xVar.f78671e = R.attr.m;
        xVar.f78672f = R.attr.m;
        xVar.f78674h = true;
        activityConfiguration(new C61174i(xVar));
        super.onCreate(bundle);
        this.f138588g = this;
        setContentView(R.layout.al2);
        this.f138583b = (TextTitleBar) findViewById(R.id.eiz);
        this.f138584c = (EditText) findViewById(R.id.cok);
        this.f138585d = (ImageView) findViewById(R.id.a6d);
        View findViewById = findViewById(R.id.a6d);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View$OnClickListenerC61175j(this));
        }
        this.f138589h = new EditOriginMusicTitlePresenter(this);
        this.f138587f = m110633a(getIntent(), "MUSIC_TITLE");
        mo98612a(false);
        this.f138584c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50)});
        this.f138584c.addTextChangedListener(new TextWatcher() {
            /* class com.p2082ss.android.ugc.aweme.music.p3481ui.EditOriginMusicTitleActivity.C610791 */

            static {
                Covode.recordClassIndex(71680);
            }

            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (charSequence.length() > 0) {
                    EditOriginMusicTitleActivity.this.mo98612a(true);
                    EditOriginMusicTitleActivity.this.f138585d.setVisibility(0);
                    return;
                }
                EditOriginMusicTitleActivity.this.mo98612a(false);
                EditOriginMusicTitleActivity.this.f138585d.setVisibility(4);
            }
        });
        this.f138583b.setOnTitleBarClickListener(new AbstractC17251a() {
            /* class com.p2082ss.android.ugc.aweme.music.p3481ui.EditOriginMusicTitleActivity.C610802 */

            static {
                Covode.recordClassIndex(71681);
            }

            @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
            /* renamed from: a */
            public final void mo27339a(View view) {
                EditOriginMusicTitleActivity.this.finish();
            }

            @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
            /* renamed from: b */
            public final void mo27340b(View view) {
                String trim = EditOriginMusicTitleActivity.this.f138584c.getText().toString().trim().replaceAll("[ ]{2,}", " ").trim();
                if (!Pattern.matches("[._ \\u0030-\\u0039\\u0041-\\u005A\\u005F\\u0061-\\u007A\\u00C0-\\u02B8\\u0370-\\u058F\\u0600-\\u077F\\u0900-\\u1DBF\\u1E00-\\u1FFF\\u2150-\\u218F\\u2C00-\\u2DDF\\u2E80-\\u2FDF\\u3040-\\u31FF\\u3400-\\u4DBF\\u4E00-\\uA6FF\\uA720-\\uABFF\\uAC00-\\uD7A3]+", trim)) {
                    new C79459a(EditOriginMusicTitleActivity.this.f138588g).mo123050a(R.string.bj3).mo123053a();
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("title", trim);
                } catch (JSONException unused) {
                }
                C39162r.onEvent(MobClick.obtain().setEventName("confirm_title").setLabelName("song_cover").setValue(EditOriginMusicTitleActivity.this.f138587f).setJsonObject(jSONObject));
                C39162r.onEvent(MobClick.obtain().setEventName("original_title_change_alert").setLabelName("original_music"));
                EditOriginMusicTitleActivity.this.f138586e = trim;
                EditOriginMusicTitlePresenter editOriginMusicTitlePresenter = EditOriginMusicTitleActivity.this.f138589h;
                ((EditOriginMusicTitlePresenter.MusicTitleApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f79771d).create(EditOriginMusicTitlePresenter.MusicTitleApi.class)).alterMusicTitle(EditOriginMusicTitleActivity.this.f138587f, EditOriginMusicTitleActivity.this.f138586e).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00b6: INVOKE  
                      (wrap: f.a.t<com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter$a> : 0x00ad: INVOKE  (r1v9 f.a.t<com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter$a>) = 
                      (wrap: f.a.t<com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter$a> : 0x00a3: INVOKE  (r1v8 f.a.t<com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter$a>) = 
                      (wrap: f.a.t<com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter$a> : 0x0099: INVOKE  (r1v7 f.a.t<com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter$a>) = 
                      (wrap: com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter$MusicTitleApi : 0x0097: CHECK_CAST (r0v26 com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter$MusicTitleApi) = (com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter$MusicTitleApi) (wrap: java.lang.Object : 0x0093: INVOKE  (r0v25 java.lang.Object) = 
                      (wrap: com.ss.android.ugc.aweme.framework.services.IRetrofit : 0x008d: INVOKE  (r1v6 com.ss.android.ugc.aweme.framework.services.IRetrofit) = 
                      (wrap: com.ss.android.ugc.aweme.framework.services.IRetrofitService : 0x0087: INVOKE  (r1v5 com.ss.android.ugc.aweme.framework.services.IRetrofitService) = false type: STATIC call: com.ss.android.ugc.aweme.services.RetrofitService.createIRetrofitServicebyMonsterPlugin(boolean):com.ss.android.ugc.aweme.framework.services.IRetrofitService)
                      (wrap: java.lang.String : 0x008b: SGET  (r0v23 java.lang.String) =  com.ss.android.ugc.aweme.app.api.Api.d java.lang.String)
                     type: INTERFACE call: com.ss.android.ugc.aweme.framework.services.IRetrofitService.createNewRetrofit(java.lang.String):com.ss.android.ugc.aweme.framework.services.IRetrofit)
                      (wrap: java.lang.Class : 0x0091: CONST_CLASS   com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter$MusicTitleApi.class)
                     type: INTERFACE call: com.ss.android.ugc.aweme.framework.services.IRetrofit.create(java.lang.Class):java.lang.Object))
                      (wrap: java.lang.String : 0x0080: IGET  (r6v0 java.lang.String) = 
                      (wrap: com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity : 0x007e: IGET  (r0v21 com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity) = (r7v0 'this' com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity$2 A[IMMUTABLE_TYPE, THIS]) com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity.2.a com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity)
                     com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity.f java.lang.String)
                      (wrap: java.lang.String : 0x0084: IGET  (r5v0 java.lang.String) = 
                      (wrap: com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity : 0x0082: IGET  (r0v22 com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity) = (r7v0 'this' com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity$2 A[IMMUTABLE_TYPE, THIS]) com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity.2.a com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity)
                     com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity.e java.lang.String)
                     type: INTERFACE call: com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter.MusicTitleApi.alterMusicTitle(java.lang.String, java.lang.String):f.a.t)
                      (wrap: f.a.aa : 0x009f: INVOKE  (r0v28 f.a.aa) = (wrap: f.a.aa : 0x009d: SGET  (r0v27 f.a.aa) =  f.a.k.a.c f.a.aa) type: STATIC call: f.a.h.a.b(f.a.aa):f.a.aa)
                     type: VIRTUAL call: f.a.t.b(f.a.aa):f.a.t)
                      (wrap: f.a.aa : 0x00a9: INVOKE  (r0v30 f.a.aa) = (wrap: f.a.aa : 0x00a7: SGET  (r0v29 f.a.aa) =  f.a.a.b.a.a f.a.aa) type: STATIC call: f.a.a.a.a.a(f.a.aa):f.a.aa)
                     type: VIRTUAL call: f.a.t.a(f.a.aa):f.a.t)
                      (wrap: com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter$1 : 0x00b3: CONSTRUCTOR  (r0v31 com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter$1) = (r3v1 'editOriginMusicTitlePresenter' com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter) call: com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter.1.<init>(com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter):void type: CONSTRUCTOR)
                     type: VIRTUAL call: f.a.t.b(f.a.z):void in method: com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity.2.b(android.view.View):void, file: classes5.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00b3: CONSTRUCTOR  (r0v31 com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter$1) = (r3v1 'editOriginMusicTitlePresenter' com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter) call: com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter.1.<init>(com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity.2.b(android.view.View):void, file: classes5.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 18 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 24 more
                    */
                /*
                // Method dump skipped, instructions count: 251
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.music.p3481ui.EditOriginMusicTitleActivity.C610802.mo27340b(android.view.View):void");
            }
        });
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m110633a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
