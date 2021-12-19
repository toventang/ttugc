package com.p2082ss.android.ugc.aweme.base.p2368b.p2369a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.AbstractC58900e;

/* renamed from: com.ss.android.ugc.aweme.base.b.a.s */
final class C34522s implements AbstractC58900e {

    /* renamed from: a */
    private Context f81517a;

    /* renamed from: b */
    private Keva f81518b;

    static {
        Covode.recordClassIndex(41480);
    }

    @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.AbstractC58900e
    /* renamed from: a */
    public final int mo60956a() {
        return this.f81518b.getInt("current_video_width", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.AbstractC58900e
    /* renamed from: b */
    public final int mo60961b() {
        return this.f81518b.getInt("current_video_height", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.AbstractC58900e
    /* renamed from: c */
    public final float mo60964c() {
        return this.f81518b.getFloat("volume", 0.0f);
    }

    @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.AbstractC58900e
    /* renamed from: d */
    public final boolean mo60967d() {
        return this.f81518b.getBoolean("should_mute", false);
    }

    @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.AbstractC58900e
    /* renamed from: a */
    public final void mo60958a(float f) {
        this.f81518b.storeFloat("volume", f);
    }

    @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.AbstractC58900e
    /* renamed from: b */
    public final void mo60962b(int i) {
        this.f81518b.storeInt("current_video_height", i);
    }

    @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.AbstractC58900e
    /* renamed from: d */
    public final void mo60966d(String str) {
        this.f81518b.storeString("current_video_path", str);
    }

    @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.AbstractC58900e
    /* renamed from: f */
    public final void mo60969f(String str) {
        this.f81518b.storeString("source", str);
    }

    public C34522s(Context context) {
        this.f81517a = context;
        this.f81518b = Keva.getRepoFromSp(context, "LiveWallPaper", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.AbstractC58900e
    /* renamed from: e */
    public final String mo60968e(String str) {
        return this.f81518b.getString("source", str);
    }

    @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.AbstractC58900e
    /* renamed from: a */
    public final String mo60957a(String str) {
        return this.f81518b.getString("live_wall_paper_list", str);
    }

    @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.AbstractC58900e
    /* renamed from: b */
    public final void mo60963b(String str) {
        this.f81518b.storeString("live_wall_paper_list", str);
    }

    @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.AbstractC58900e
    /* renamed from: c */
    public final String mo60965c(String str) {
        return this.f81518b.getString("current_video_path", str);
    }

    @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.AbstractC58900e
    /* renamed from: a */
    public final void mo60959a(int i) {
        this.f81518b.storeInt("current_video_width", i);
    }

    @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.AbstractC58900e
    /* renamed from: a */
    public final void mo60960a(boolean z) {
        this.f81518b.storeBoolean("should_mute", z);
    }
}
