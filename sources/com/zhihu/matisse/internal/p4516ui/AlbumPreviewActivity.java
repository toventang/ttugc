package com.zhihu.matisse.internal.p4516ui;

import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhihu.matisse.internal.entity.Album;
import com.zhihu.matisse.internal.entity.C87956c;
import com.zhihu.matisse.internal.entity.Item;
import com.zhihu.matisse.internal.p4514b.C87947b;
import com.zhihu.matisse.internal.p4516ui.p4517a.C87969c;
import java.util.ArrayList;

/* renamed from: com.zhihu.matisse.internal.ui.AlbumPreviewActivity */
public class AlbumPreviewActivity extends AbstractView$OnClickListenerC87958a implements C87947b.AbstractC87948a {

    /* renamed from: l */
    private C87947b f199769l = new C87947b();

    /* renamed from: m */
    private boolean f199770m;

    static {
        Covode.recordClassIndex(103975);
    }

    @Override // com.zhihu.matisse.internal.p4514b.C87947b.AbstractC87948a
    /* renamed from: a */
    public final void mo142452a() {
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

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        this.f199769l.mo142451b();
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

    @Override // com.zhihu.matisse.internal.p4514b.C87947b.AbstractC87948a
    /* renamed from: a */
    public final void mo142453a(Cursor cursor) {
        if (cursor != null) {
            ArrayList arrayList = new ArrayList();
            while (cursor.moveToNext()) {
                arrayList.add(Item.m153004a(cursor));
            }
            if (!arrayList.isEmpty()) {
                C87969c cVar = (C87969c) this.f199773c.getAdapter();
                cVar.mo142505a(arrayList);
                cVar.notifyDataSetChanged();
                if (!this.f199770m) {
                    this.f199770m = true;
                    int indexOf = arrayList.indexOf(getIntent().getParcelableExtra("extra_item"));
                    this.f199773c.setCurrentItem(indexOf, false);
                    this.f199779i = indexOf;
                }
            }
        }
    }

    @Override // com.zhihu.matisse.internal.p4516ui.AbstractView$OnClickListenerC87958a, androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        super.onCreate(bundle);
        if (!C87956c.C87957a.f199768a.f199762p) {
            setResult(0);
            finish();
            return;
        }
        this.f199769l.mo142449a(this, this);
        this.f199769l.mo142450a((Album) getIntent().getParcelableExtra("extra_album"), false);
        Item item = (Item) getIntent().getParcelableExtra("extra_item");
        if (this.f199772b.f199752f) {
            this.f199775e.setCheckedNum(this.f199771a.mo142465e(item));
        } else {
            this.f199775e.setChecked(this.f199771a.mo142461c(item));
        }
        mo142487a(item);
    }
}
