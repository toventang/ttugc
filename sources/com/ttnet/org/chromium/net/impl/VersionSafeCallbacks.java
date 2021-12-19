package com.ttnet.org.chromium.net.impl;

import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.net.AbstractC87528aa;
import com.ttnet.org.chromium.net.AbstractC87529ab;
import com.ttnet.org.chromium.net.AbstractC87533ac;
import com.ttnet.org.chromium.net.AbstractC87536c;
import com.ttnet.org.chromium.net.AbstractC87540d;
import com.ttnet.org.chromium.net.AbstractC87647l;
import com.ttnet.org.chromium.net.AbstractC87648m;
import com.ttnet.org.chromium.net.AbstractC87655t;
import com.ttnet.org.chromium.net.AbstractC87678z;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

public final class VersionSafeCallbacks {
    static {
        Covode.recordClassIndex(103564);
    }

    /* renamed from: com.ttnet.org.chromium.net.impl.VersionSafeCallbacks$b */
    public static final class C87585b extends AbstractC87647l {

        /* renamed from: a */
        final AbstractC87647l f198895a;

        static {
            Covode.recordClassIndex(103567);
        }

        @Override // com.ttnet.org.chromium.net.AbstractC87647l
        /* renamed from: a */
        public final Executor mo141919a() {
            return this.f198895a.mo141919a();
        }

        public final int hashCode() {
            return this.f198895a.hashCode();
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C87585b)) {
                return false;
            }
            return this.f198895a.equals(((C87585b) obj).f198895a);
        }
    }

    /* renamed from: com.ttnet.org.chromium.net.impl.VersionSafeCallbacks$c */
    public static final class C87586c extends AbstractC87648m {

        /* renamed from: a */
        final AbstractC87648m f198896a;

        static {
            Covode.recordClassIndex(103568);
        }

        @Override // com.ttnet.org.chromium.net.AbstractC87648m
        /* renamed from: a */
        public final Executor mo141922a() {
            return this.f198896a.mo141922a();
        }

        public final int hashCode() {
            return this.f198896a.hashCode();
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C87586c)) {
                return false;
            }
            return this.f198896a.equals(((C87586c) obj).f198896a);
        }
    }

    /* renamed from: com.ttnet.org.chromium.net.impl.VersionSafeCallbacks$d */
    public static final class C87587d extends AbstractC87655t.AbstractC87656a {

        /* renamed from: a */
        private final AbstractC87655t.AbstractC87656a f198897a;

        static {
            Covode.recordClassIndex(103569);
        }

        @Override // com.ttnet.org.chromium.net.AbstractC87655t.AbstractC87656a
        public final Executor getExecutor() {
            return this.f198897a.getExecutor();
        }

        @Override // com.ttnet.org.chromium.net.AbstractC87655t.AbstractC87656a
        public final void onRequestFinished(AbstractC87655t tVar) {
            this.f198897a.onRequestFinished(tVar);
        }

        public C87587d(AbstractC87655t.AbstractC87656a aVar) {
            super(aVar.getExecutor());
            this.f198897a = aVar;
        }
    }

    /* renamed from: com.ttnet.org.chromium.net.impl.VersionSafeCallbacks$e */
    public static final class C87588e extends AbstractC87678z {

        /* renamed from: a */
        final AbstractC87678z f198898a;

        static {
            Covode.recordClassIndex(103570);
        }

        @Override // com.ttnet.org.chromium.net.AbstractC87678z
        /* renamed from: a */
        public final long mo141927a() {
            return this.f198898a.mo141927a();
        }

        @Override // com.ttnet.org.chromium.net.AbstractC87678z, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f198898a.close();
        }

        public C87588e(AbstractC87678z zVar) {
            this.f198898a = zVar;
        }

        @Override // com.ttnet.org.chromium.net.AbstractC87678z
        /* renamed from: a */
        public final void mo141928a(AbstractC87528aa aaVar) {
            this.f198898a.mo141928a(aaVar);
        }

        @Override // com.ttnet.org.chromium.net.AbstractC87678z
        /* renamed from: a */
        public final void mo141929a(AbstractC87528aa aaVar, ByteBuffer byteBuffer) {
            this.f198898a.mo141929a(aaVar, byteBuffer);
        }
    }

    public static final class UrlRequestStatusListener extends AbstractC87529ab.AbstractC87532c {

        /* renamed from: a */
        private final AbstractC87529ab.AbstractC87532c f198893a;

        static {
            Covode.recordClassIndex(103565);
        }

        public UrlRequestStatusListener(AbstractC87529ab.AbstractC87532c cVar) {
            this.f198893a = cVar;
        }

        @Override // com.ttnet.org.chromium.net.AbstractC87529ab.AbstractC87532c
        public final void onStatus(int i) {
            this.f198893a.onStatus(i);
        }
    }

    /* renamed from: com.ttnet.org.chromium.net.impl.VersionSafeCallbacks$a */
    public static final class C87584a extends AbstractC87536c.C87537a.AbstractC87539a {

        /* renamed from: a */
        private final AbstractC87536c.C87537a.AbstractC87539a f198894a;

        static {
            Covode.recordClassIndex(103566);
        }

        public C87584a(AbstractC87536c.C87537a.AbstractC87539a aVar) {
            this.f198894a = aVar;
        }

        @Override // com.ttnet.org.chromium.net.AbstractC87536c.C87537a.AbstractC87539a
        public final void loadLibrary(String str) {
            this.f198894a.loadLibrary(str);
        }
    }

    /* renamed from: com.ttnet.org.chromium.net.impl.VersionSafeCallbacks$f */
    public static final class C87589f extends AbstractC87529ab.AbstractC87531b {

        /* renamed from: a */
        private final AbstractC87529ab.AbstractC87531b f198899a;

        static {
            Covode.recordClassIndex(103571);
        }

        public C87589f(AbstractC87529ab.AbstractC87531b bVar) {
            this.f198899a = bVar;
        }

        @Override // com.ttnet.org.chromium.net.AbstractC87529ab.AbstractC87531b
        /* renamed from: a */
        public final void mo141700a(AbstractC87529ab abVar, AbstractC87533ac acVar) {
            this.f198899a.mo141700a(abVar, acVar);
        }

        @Override // com.ttnet.org.chromium.net.AbstractC87529ab.AbstractC87531b
        /* renamed from: b */
        public final void mo141706b(AbstractC87529ab abVar, AbstractC87533ac acVar) {
            this.f198899a.mo141706b(abVar, acVar);
        }

        @Override // com.ttnet.org.chromium.net.AbstractC87529ab.AbstractC87531b
        /* renamed from: a */
        public final void mo141704a(AbstractC87529ab abVar, AbstractC87655t tVar) {
            this.f198899a.mo141704a(abVar, tVar);
        }

        @Override // com.ttnet.org.chromium.net.AbstractC87529ab.AbstractC87531b
        /* renamed from: a */
        public final void mo141705a(String str, AbstractC87655t tVar) {
            this.f198899a.mo141705a(str, tVar);
        }

        @Override // com.ttnet.org.chromium.net.AbstractC87529ab.AbstractC87531b
        /* renamed from: a */
        public final void mo141701a(AbstractC87529ab abVar, AbstractC87533ac acVar, AbstractC87540d dVar) {
            this.f198899a.mo141701a(abVar, acVar, dVar);
        }

        @Override // com.ttnet.org.chromium.net.AbstractC87529ab.AbstractC87531b
        /* renamed from: b */
        public final void mo141707b(AbstractC87529ab abVar, AbstractC87533ac acVar, String str) {
            this.f198899a.mo141707b(abVar, acVar, str);
        }

        @Override // com.ttnet.org.chromium.net.AbstractC87529ab.AbstractC87531b
        /* renamed from: a */
        public final void mo141702a(AbstractC87529ab abVar, AbstractC87533ac acVar, String str) {
            this.f198899a.mo141702a(abVar, acVar, str);
        }

        @Override // com.ttnet.org.chromium.net.AbstractC87529ab.AbstractC87531b
        /* renamed from: a */
        public final void mo141703a(AbstractC87529ab abVar, AbstractC87533ac acVar, ByteBuffer byteBuffer) {
            this.f198899a.mo141703a(abVar, acVar, byteBuffer);
        }
    }
}
