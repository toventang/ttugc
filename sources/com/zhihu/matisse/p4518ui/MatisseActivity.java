package com.zhihu.matisse.p4518ui;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0211a;
import androidx.appcompat.app.ActivityC0218d;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.FileProvider;
import androidx.core.p033d.C0648b;
import androidx.fragment.app.Fragment;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.android.play.core.p1965d.C26975a;
import com.p2082ss.android.ugc.aweme.i18n.language.i18n.C53457c;
import com.p2082ss.android.ugc.trill.R;
import com.zhihu.matisse.internal.entity.Album;
import com.zhihu.matisse.internal.entity.C87956c;
import com.zhihu.matisse.internal.entity.Item;
import com.zhihu.matisse.internal.p4514b.C87945a;
import com.zhihu.matisse.internal.p4514b.C87949c;
import com.zhihu.matisse.internal.p4515c.C87950a;
import com.zhihu.matisse.internal.p4515c.C87951b;
import com.zhihu.matisse.internal.p4516ui.AlbumPreviewActivity;
import com.zhihu.matisse.internal.p4516ui.C87972b;
import com.zhihu.matisse.internal.p4516ui.SelectedPreviewActivity;
import com.zhihu.matisse.internal.p4516ui.p4517a.C87961a;
import com.zhihu.matisse.internal.p4516ui.p4517a.C87968b;
import com.zhihu.matisse.internal.p4516ui.widget.C87981a;
import com.zhihu.matisse.internal.p4516ui.widget.C87984b;
import com.zhihu.matisse.internal.p4516ui.widget.CheckRadioView;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import p078c.p080b.C1757e;

/* renamed from: com.zhihu.matisse.ui.MatisseActivity */
public class MatisseActivity extends ActivityC0218d implements View.OnClickListener, AdapterView.OnItemSelectedListener, C87945a.AbstractC87946a, C87961a.AbstractC87964b, C87961a.AbstractC87966d, C87961a.AbstractC87967e, C87972b.AbstractC87973a {

    /* renamed from: a */
    public final C87945a f199852a = new C87945a();

    /* renamed from: b */
    public C87981a f199853b;

    /* renamed from: c */
    private C87950a f199854c;

    /* renamed from: d */
    private C87949c f199855d = new C87949c(this);

    /* renamed from: e */
    private C87956c f199856e;

    /* renamed from: f */
    private C87968b f199857f;

    /* renamed from: g */
    private TextView f199858g;

    /* renamed from: h */
    private TextView f199859h;

    /* renamed from: i */
    private View f199860i;

    /* renamed from: j */
    private View f199861j;

    /* renamed from: k */
    private LinearLayout f199862k;

    /* renamed from: l */
    private CheckRadioView f199863l;

    /* renamed from: m */
    private boolean f199864m;

    static {
        Covode.recordClassIndex(104012);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onResume() {
        C15477a.m28476b(this);
        super.onResume();
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.zhihu.matisse.internal.p4516ui.C87972b.AbstractC87973a
    /* renamed from: c */
    public final C87949c mo142508c() {
        return this.f199855d;
    }

    @Override // com.zhihu.matisse.internal.p4514b.C87945a.AbstractC87946a
    /* renamed from: a */
    public final void mo142447a() {
        this.f199857f.swapCursor(null);
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onBackPressed() {
        setResult(0);
        super.onBackPressed();
    }

    @Override // com.zhihu.matisse.internal.p4516ui.p4517a.C87961a.AbstractC87964b
    /* renamed from: b */
    public final void mo142500b() {
        m153052e();
        if (this.f199856e.f199763q != null) {
            this.f199855d.mo142460c();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        C87945a aVar = this.f199852a;
        if (aVar.f199716b != null) {
            aVar.f199716b.mo4099a(1);
        }
        aVar.f199717c = null;
        this.f199856e.f199767u = null;
        this.f199856e.f199763q = null;
    }

    /* renamed from: g */
    private int m153054g() {
        int e = this.f199855d.mo142464e();
        int i = 0;
        for (int i2 = 0; i2 < e; i2++) {
            Item item = this.f199855d.mo142457b().get(i2);
            if (item.mo142474a() && C87951b.m152996a(item.f199739d) > ((float) this.f199856e.f199766t)) {
                i++;
            }
        }
        return i;
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
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

    /* renamed from: e */
    private void m153052e() {
        int e = this.f199855d.mo142464e();
        if (e == 0) {
            this.f199858g.setEnabled(false);
            this.f199859h.setEnabled(false);
            this.f199859h.setText(getString(R.string.d18));
        } else if (e != 1 || !this.f199856e.mo142483a()) {
            this.f199858g.setEnabled(true);
            this.f199859h.setEnabled(true);
            this.f199859h.setText(getString(R.string.d17, new Object[]{Integer.valueOf(e)}));
        } else {
            this.f199858g.setEnabled(true);
            this.f199859h.setText(R.string.d18);
            this.f199859h.setEnabled(true);
        }
        if (this.f199856e.f199764r) {
            this.f199862k.setVisibility(0);
            m153053f();
            return;
        }
        this.f199862k.setVisibility(4);
    }

    /* renamed from: f */
    private void m153053f() {
        this.f199863l.setChecked(this.f199864m);
        if (m153054g() > 0 && this.f199864m) {
            C87984b.m153051a("", getString(R.string.d1e, new Object[]{Integer.valueOf(this.f199856e.f199766t)})).show(getSupportFragmentManager(), C87984b.class.getName());
            this.f199863l.setChecked(false);
            this.f199864m = false;
        }
    }

    @Override // com.zhihu.matisse.internal.p4516ui.p4517a.C87961a.AbstractC87967e
    /* renamed from: d */
    public final void mo142502d() {
        Uri uri;
        C87950a aVar = this.f199854c;
        if (aVar != null) {
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            if (intent.resolveActivity(getPackageManager()) != null) {
                try {
                    String a = C1764a.m5928a("JPEG_%s.jpg", new Object[]{new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date())});
                    if (aVar.f199728c.f199741a) {
                        uri = C1757e.m5902a(aVar.f199726a.get(), a, "image/jpeg");
                    } else {
                        File externalFilesDir = aVar.f199726a.get().getExternalFilesDir(Environment.DIRECTORY_PICTURES);
                        if (aVar.f199728c.f199743c != null) {
                            externalFilesDir = new File(externalFilesDir, aVar.f199728c.f199743c);
                        }
                        File file = new File(externalFilesDir, a);
                        if ("mounted".equals(C0648b.m2385a(file))) {
                            uri = FileProvider.getUriForFile(aVar.f199726a.get(), aVar.f199728c.f199742b, file);
                        } else {
                            return;
                        }
                    }
                    if (uri != null) {
                        aVar.f199729d = uri;
                        intent.putExtra("output", aVar.f199729d);
                        intent.addFlags(2);
                        if (Build.VERSION.SDK_INT < 21) {
                            for (ResolveInfo resolveInfo : getPackageManager().queryIntentActivities(intent, 65536)) {
                                grantUriPermission(resolveInfo.activityInfo.packageName, aVar.f199729d, 3);
                            }
                        }
                        if (aVar.f199727b != null) {
                            aVar.f199727b.get().startActivityForResult(intent, 24);
                        } else {
                            aVar.f199726a.get().startActivityForResult(intent, 24);
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        Context b = C53457c.m98656b(context);
        C26975a.m53596a(b, false);
        super.attachBaseContext(b);
    }

    @Override // com.zhihu.matisse.internal.p4514b.C87945a.AbstractC87946a
    /* renamed from: a */
    public final void mo142448a(final Cursor cursor) {
        this.f199857f.swapCursor(cursor);
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            /* class com.zhihu.matisse.p4518ui.MatisseActivity.RunnableC879871 */

            static {
                Covode.recordClassIndex(104013);
            }

            public final void run() {
                try {
                    if (!cursor.isClosed()) {
                        cursor.moveToPosition(MatisseActivity.this.f199852a.f199718d);
                        C87981a aVar = MatisseActivity.this.f199853b;
                        MatisseActivity matisseActivity = MatisseActivity.this;
                        int i = matisseActivity.f199852a.f199718d;
                        aVar.f199844c.mo1713c(i);
                        aVar.mo142534a(matisseActivity, i);
                        Album a = Album.m152999a(cursor);
                        if (a.mo142468b() && C87956c.C87957a.f199768a.f199757k) {
                            a.mo142467a();
                        }
                        MatisseActivity.this.mo142538a(a);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f199855d.mo142458b(bundle);
        bundle.putInt("state_current_selection", this.f199852a.f199718d);
        bundle.putBoolean("checkState", this.f199864m);
    }

    /* renamed from: a */
    public final void mo142538a(Album album) {
        if (!album.mo142468b() || !album.mo142469c()) {
            this.f199860i.setVisibility(0);
            this.f199861j.setVisibility(8);
            getSupportFragmentManager().mo3552a().mo3470b(R.id.acf, C87972b.m153039a(album), C87972b.class.getSimpleName()).mo3473c();
            return;
        }
        this.f199860i.setVisibility(8);
        this.f199861j.setVisibility(0);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.a0e) {
            Intent intent = new Intent(this, SelectedPreviewActivity.class);
            intent.putExtra("extra_default_bundle", this.f199855d.mo142454a());
            intent.putExtra("extra_result_original_enable", this.f199864m);
            startActivityForResult(intent, 23);
        } else if (view.getId() == R.id.a04) {
            Intent intent2 = new Intent();
            intent2.putParcelableArrayListExtra("extra_result_selection", (ArrayList) this.f199855d.mo142460c());
            intent2.putExtra("extra_result_original_enable", this.f199864m);
            setResult(-1, intent2);
            finish();
        } else if (view.getId() == R.id.cxr) {
            int g = m153054g();
            if (g > 0) {
                C87984b.m153051a("", getString(R.string.d1d, new Object[]{Integer.valueOf(g), Integer.valueOf(this.f199856e.f199766t)})).show(getSupportFragmentManager(), C87984b.class.getName());
                return;
            }
            boolean z = !this.f199864m;
            this.f199864m = z;
            this.f199863l.setChecked(z);
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        C87956c cVar = C87956c.C87957a.f199768a;
        this.f199856e = cVar;
        setTheme(cVar.f199750d);
        super.onCreate(bundle);
        if (!this.f199856e.f199762p) {
            setResult(0);
            finish();
            return;
        }
        setContentView(R.layout.bk);
        if (this.f199856e.mo142484b()) {
            setRequestedOrientation(this.f199856e.f199751e);
        }
        if (this.f199856e.f199757k) {
            this.f199854c = new C87950a(this);
            if (this.f199856e.f199758l != null) {
                this.f199854c.f199728c = this.f199856e.f199758l;
            } else {
                throw new RuntimeException("Don't forget to set CaptureStrategy.");
            }
        }
        Toolbar toolbar = (Toolbar) findViewById(R.id.ek6);
        setSupportActionBar(toolbar);
        AbstractC0211a supportActionBar = getSupportActionBar();
        supportActionBar.mo411a();
        supportActionBar.mo416a(true);
        Drawable navigationIcon = toolbar.getNavigationIcon();
        TypedArray obtainStyledAttributes = getTheme().obtainStyledAttributes(new int[]{R.attr.hz});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        navigationIcon.setColorFilter(color, PorterDuff.Mode.SRC_IN);
        this.f199858g = (TextView) findViewById(R.id.a0e);
        this.f199859h = (TextView) findViewById(R.id.a04);
        this.f199858g.setOnClickListener(this);
        this.f199859h.setOnClickListener(this);
        this.f199860i = findViewById(R.id.acf);
        this.f199861j = findViewById(R.id.ave);
        this.f199862k = (LinearLayout) findViewById(R.id.cxr);
        this.f199863l = (CheckRadioView) findViewById(R.id.cxq);
        this.f199862k.setOnClickListener(this);
        this.f199855d.mo142455a(bundle);
        if (bundle != null) {
            this.f199864m = bundle.getBoolean("checkState");
        }
        m153052e();
        this.f199857f = new C87968b(this);
        C87981a aVar = new C87981a(this);
        this.f199853b = aVar;
        aVar.f199845d = this;
        C87981a aVar2 = this.f199853b;
        aVar2.f199843b = (TextView) findViewById(R.id.dus);
        Drawable drawable = aVar2.f199843b.getCompoundDrawables()[2];
        TypedArray obtainStyledAttributes2 = aVar2.f199843b.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.hz});
        int color2 = obtainStyledAttributes2.getColor(0, 0);
        obtainStyledAttributes2.recycle();
        drawable.setColorFilter(color2, PorterDuff.Mode.SRC_IN);
        aVar2.f199843b.setVisibility(8);
        aVar2.f199843b.setOnClickListener(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0134: INVOKE  
              (wrap: android.widget.TextView : 0x012d: IGET  (r1v8 android.widget.TextView) = (r6v0 'aVar2' com.zhihu.matisse.internal.ui.widget.a) com.zhihu.matisse.internal.ui.widget.a.b android.widget.TextView)
              (wrap: com.zhihu.matisse.internal.ui.widget.a$2 : 0x0131: CONSTRUCTOR  (r0v46 com.zhihu.matisse.internal.ui.widget.a$2) = (r6v0 'aVar2' com.zhihu.matisse.internal.ui.widget.a) call: com.zhihu.matisse.internal.ui.widget.a.2.<init>(com.zhihu.matisse.internal.ui.widget.a):void type: CONSTRUCTOR)
             type: VIRTUAL call: android.widget.TextView.setOnClickListener(android.view.View$OnClickListener):void in method: com.zhihu.matisse.ui.MatisseActivity.onCreate(android.os.Bundle):void, file: classes9.dex
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0131: CONSTRUCTOR  (r0v46 com.zhihu.matisse.internal.ui.widget.a$2) = (r6v0 'aVar2' com.zhihu.matisse.internal.ui.widget.a) call: com.zhihu.matisse.internal.ui.widget.a.2.<init>(com.zhihu.matisse.internal.ui.widget.a):void type: CONSTRUCTOR in method: com.zhihu.matisse.ui.MatisseActivity.onCreate(android.os.Bundle):void, file: classes9.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 18 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.zhihu.matisse.internal.ui.widget.a, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 24 more
            */
        /*
        // Method dump skipped, instructions count: 392
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zhihu.matisse.p4518ui.MatisseActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.zhihu.matisse.internal.p4516ui.p4517a.C87961a.AbstractC87966d
    /* renamed from: a */
    public final void mo142501a(Album album, Item item, int i) {
        Intent intent = new Intent(this, AlbumPreviewActivity.class);
        intent.putExtra("extra_album", album);
        intent.putExtra("extra_item", item);
        intent.putExtra("extra_default_bundle", this.f199855d.mo142454a());
        intent.putExtra("extra_result_original_enable", this.f199864m);
        startActivityForResult(intent, 23);
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            if (i == 23) {
                Bundle bundleExtra = intent.getBundleExtra("extra_result_bundle");
                Context context = BadParcelableCrashOptimizer.getContext();
                if (!(bundleExtra == null || context == null)) {
                    bundleExtra.setClassLoader(context.getClassLoader());
                }
                ArrayList parcelableArrayList = bundleExtra.getParcelableArrayList("state_selection");
                this.f199864m = intent.getBooleanExtra("extra_result_original_enable", false);
                int i3 = bundleExtra.getInt("state_collection_type", 0);
                if (intent.getBooleanExtra("extra_result_apply", false)) {
                    Intent intent2 = new Intent();
                    ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                    if (parcelableArrayList != null) {
                        Iterator it = parcelableArrayList.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((Item) it.next()).f199738c);
                        }
                    }
                    intent2.putParcelableArrayListExtra("extra_result_selection", arrayList);
                    intent2.putExtra("extra_result_original_enable", this.f199864m);
                    setResult(-1, intent2);
                } else {
                    C87949c cVar = this.f199855d;
                    if (parcelableArrayList.size() == 0) {
                        cVar.f199724b = 0;
                    } else {
                        cVar.f199724b = i3;
                    }
                    cVar.f199723a.clear();
                    cVar.f199723a.addAll(parcelableArrayList);
                    Fragment a = getSupportFragmentManager().mo3551a(C87972b.class.getSimpleName());
                    if (a instanceof C87972b) {
                        ((C87972b) a).f199803a.notifyDataSetChanged();
                    }
                    m153052e();
                    return;
                }
            } else if (i == 24) {
                Uri uri = this.f199854c.f199729d;
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                arrayList2.add(uri);
                Intent intent3 = new Intent();
                intent3.putParcelableArrayListExtra("extra_result_selection", arrayList2);
                setResult(-1, intent3);
                if (Build.VERSION.SDK_INT < 21) {
                    revokeUriPermission(uri, 3);
                }
            } else {
                return;
            }
            finish();
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        this.f199852a.f199718d = i;
        this.f199857f.getCursor().moveToPosition(i);
        Album a = Album.m152999a(this.f199857f.getCursor());
        if (a.mo142468b() && C87956c.C87957a.f199768a.f199757k) {
            a.mo142467a();
        }
        mo142538a(a);
    }
}
