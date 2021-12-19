package p4600h.p4610e;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import p4600h.C89088ab;
import p4600h.C89376n;
import p4600h.C89391z;
import p4600h.p4601a.AbstractC89052b;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4621l.AbstractC89306h;

/* renamed from: h.e.g */
public final class C89150g implements AbstractC89306h<File> {

    /* renamed from: a */
    public final File f202856a;

    /* renamed from: b */
    public final EnumC89158i f202857b;

    /* renamed from: c */
    public final AbstractC89172b<File, Boolean> f202858c;

    /* renamed from: d */
    public final AbstractC89172b<File, C89391z> f202859d;

    /* renamed from: e */
    public final AbstractC89183m<File, IOException, C89391z> f202860e;

    /* renamed from: f */
    public final int f202861f;

    static {
        Covode.recordClassIndex(105234);
    }

    @Override // p4600h.p4621l.AbstractC89306h
    /* renamed from: a */
    public final Iterator<File> mo2926a() {
        return new C89152b();
    }

    /* renamed from: h.e.g$b */
    final class C89152b extends AbstractC89052b<File> {

        /* renamed from: b */
        private final ArrayDeque<AbstractC89156c> f202863b;

        static {
            Covode.recordClassIndex(105236);
        }

        /* renamed from: h.e.g$b$b */
        final class C89154b extends AbstractC89156c {

            /* renamed from: a */
            final /* synthetic */ C89152b f202869a;

            /* renamed from: c */
            private boolean f202870c;

            static {
                Covode.recordClassIndex(105238);
            }

            @Override // p4600h.p4610e.C89150g.AbstractC89156c
            /* renamed from: a */
            public final File mo143587a() {
                if (this.f202870c) {
                    return null;
                }
                this.f202870c = true;
                return this.f202875b;
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C89154b(C89152b bVar, File file) {
                super(file);
                C89219l.m154721d(file, "");
                this.f202869a = bVar;
                if (C89088ab.f202802a) {
                    boolean isFile = file.isFile();
                    if (C89088ab.f202802a && !isFile) {
                        throw new AssertionError("rootFile must be verified to be file beforehand.");
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h.e.g$b$a */
        public final class C89153a extends AbstractC89151a {

            /* renamed from: a */
            final /* synthetic */ C89152b f202864a;

            /* renamed from: c */
            private boolean f202865c;

            /* renamed from: d */
            private File[] f202866d;

            /* renamed from: e */
            private int f202867e;

            /* renamed from: f */
            private boolean f202868f;

            static {
                Covode.recordClassIndex(105237);
            }

            @Override // p4600h.p4610e.C89150g.AbstractC89156c
            /* renamed from: a */
            public final File mo143587a() {
                if (!this.f202868f && this.f202866d == null) {
                    AbstractC89172b<File, Boolean> bVar = C89150g.this.f202858c;
                    if (bVar != null && !bVar.invoke(this.f202875b).booleanValue()) {
                        return null;
                    }
                    File[] listFiles = this.f202875b.listFiles();
                    this.f202866d = listFiles;
                    if (listFiles == null) {
                        AbstractC89183m<File, IOException, C89391z> mVar = C89150g.this.f202860e;
                        if (mVar != null) {
                            mVar.invoke(this.f202875b, new C89144a(this.f202875b, null, "Cannot list files in a directory", 2, null));
                        }
                        this.f202868f = true;
                    }
                }
                File[] fileArr = this.f202866d;
                if (fileArr != null && this.f202867e < fileArr.length) {
                    File[] fileArr2 = this.f202866d;
                    if (fileArr2 == null) {
                        C89219l.m154715b();
                    }
                    int i = this.f202867e;
                    this.f202867e = i + 1;
                    return fileArr2[i];
                } else if (!this.f202865c) {
                    this.f202865c = true;
                    return this.f202875b;
                } else {
                    AbstractC89172b<File, C89391z> bVar2 = C89150g.this.f202859d;
                    if (bVar2 != null) {
                        bVar2.invoke(this.f202875b);
                    }
                    return null;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C89153a(C89152b bVar, File file) {
                super(file);
                C89219l.m154721d(file, "");
                this.f202864a = bVar;
            }
        }

        @Override // p4600h.p4601a.AbstractC89052b
        /* renamed from: a */
        public final void mo143438a() {
            File a;
            while (true) {
                AbstractC89156c peek = this.f202863b.peek();
                if (peek == null) {
                    mo143440b();
                    return;
                }
                a = peek.mo143587a();
                if (a == null) {
                    this.f202863b.pop();
                } else if (C89219l.m154714a(a, peek.f202875b) || !a.isDirectory() || this.f202863b.size() >= C89150g.this.f202861f) {
                    mo143439a((Object) a);
                } else {
                    this.f202863b.push(m154638a(a));
                }
            }
            mo143439a((Object) a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h.e.g$b$c */
        public final class C89155c extends AbstractC89151a {

            /* renamed from: a */
            final /* synthetic */ C89152b f202871a;

            /* renamed from: c */
            private boolean f202872c;

            /* renamed from: d */
            private File[] f202873d;

            /* renamed from: e */
            private int f202874e;

            static {
                Covode.recordClassIndex(105239);
            }

            @Override // p4600h.p4610e.C89150g.AbstractC89156c
            /* renamed from: a */
            public final File mo143587a() {
                AbstractC89183m<File, IOException, C89391z> mVar;
                if (!this.f202872c) {
                    AbstractC89172b<File, Boolean> bVar = C89150g.this.f202858c;
                    if (bVar != null && !bVar.invoke(this.f202875b).booleanValue()) {
                        return null;
                    }
                    this.f202872c = true;
                    return this.f202875b;
                }
                File[] fileArr = this.f202873d;
                if (fileArr == null || this.f202874e < fileArr.length) {
                    if (this.f202873d == null) {
                        File[] listFiles = this.f202875b.listFiles();
                        this.f202873d = listFiles;
                        if (listFiles == null && (mVar = C89150g.this.f202860e) != null) {
                            mVar.invoke(this.f202875b, new C89144a(this.f202875b, null, "Cannot list files in a directory", 2, null));
                        }
                        File[] fileArr2 = this.f202873d;
                        if (fileArr2 == null || fileArr2.length == 0) {
                            AbstractC89172b<File, C89391z> bVar2 = C89150g.this.f202859d;
                            if (bVar2 != null) {
                                bVar2.invoke(this.f202875b);
                            }
                            return null;
                        }
                    }
                    File[] fileArr3 = this.f202873d;
                    if (fileArr3 == null) {
                        C89219l.m154715b();
                    }
                    int i = this.f202874e;
                    this.f202874e = i + 1;
                    return fileArr3[i];
                }
                AbstractC89172b<File, C89391z> bVar3 = C89150g.this.f202859d;
                if (bVar3 != null) {
                    bVar3.invoke(this.f202875b);
                }
                return null;
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C89155c(C89152b bVar, File file) {
                super(file);
                C89219l.m154721d(file, "");
                this.f202871a = bVar;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C89152b() {
            ArrayDeque<AbstractC89156c> arrayDeque = new ArrayDeque<>();
            this.f202863b = arrayDeque;
            if (C89150g.this.f202856a.isDirectory()) {
                arrayDeque.push(m154638a(C89150g.this.f202856a));
            } else if (C89150g.this.f202856a.isFile()) {
                arrayDeque.push(new C89154b(this, C89150g.this.f202856a));
            } else {
                mo143440b();
            }
        }

        /* renamed from: a */
        private final AbstractC89151a m154638a(File file) {
            int i = C89157h.f202876a[C89150g.this.f202857b.ordinal()];
            if (i == 1) {
                return new C89155c(this, file);
            }
            if (i == 2) {
                return new C89153a(this, file);
            }
            throw new C89376n();
        }
    }

    /* renamed from: h.e.g$c */
    static abstract class AbstractC89156c {

        /* renamed from: b */
        public final File f202875b;

        static {
            Covode.recordClassIndex(105240);
        }

        /* renamed from: a */
        public abstract File mo143587a();

        public AbstractC89156c(File file) {
            C89219l.m154721d(file, "");
            this.f202875b = file;
        }
    }

    /* renamed from: h.e.g$a */
    static abstract class AbstractC89151a extends AbstractC89156c {
        static {
            Covode.recordClassIndex(105235);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AbstractC89151a(File file) {
            super(file);
            C89219l.m154721d(file, "");
            if (C89088ab.f202802a) {
                boolean isDirectory = file.isDirectory();
                if (C89088ab.f202802a && !isDirectory) {
                    throw new AssertionError("rootDir must be verified to be directory beforehand.");
                }
            }
        }
    }

    private C89150g(File file, EnumC89158i iVar) {
        this.f202856a = file;
        this.f202857b = iVar;
        this.f202858c = null;
        this.f202859d = null;
        this.f202860e = null;
        this.f202861f = Integer.MAX_VALUE;
    }

    private /* synthetic */ C89150g(File file, EnumC89158i iVar, byte b) {
        this(file, iVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C89150g(File file, EnumC89158i iVar, char c) {
        this(file, iVar, (byte) 0);
        C89219l.m154721d(file, "");
        C89219l.m154721d(iVar, "");
    }
}
