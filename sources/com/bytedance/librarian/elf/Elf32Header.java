package com.bytedance.librarian.elf;

import com.bytedance.librarian.elf.Elf;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class Elf32Header extends Elf.Header {

    /* renamed from: j */
    private final ElfParser f48933j;

    @Override // com.bytedance.librarian.elf.Elf.Header
    /* renamed from: a */
    public final Elf.SectionHeader mo34119a() {
        return new Section32Header(this.f48933j, this);
    }

    @Override // com.bytedance.librarian.elf.Elf.Header
    /* renamed from: a */
    public final Elf.ProgramHeader mo34118a(long j) {
        return new Program32Header(this.f48933j, this, j);
    }

    @Override // com.bytedance.librarian.elf.Elf.Header
    /* renamed from: a */
    public final Elf.DynamicStructure mo34117a(long j, int i) {
        return new Dynamic32Structure(this.f48933j, this, j, i);
    }

    public Elf32Header(boolean z, ElfParser elfParser) {
        ByteOrder byteOrder;
        this.f48919a = z;
        this.f48933j = elfParser;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        if (z) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        this.f48920b = elfParser.mo34123c(allocate, 16);
        this.f48921c = elfParser.mo34122b(allocate, 28);
        this.f48922d = elfParser.mo34122b(allocate, 32);
        this.f48923e = elfParser.mo34123c(allocate, 42);
        this.f48924f = elfParser.mo34123c(allocate, 44);
        this.f48925g = elfParser.mo34123c(allocate, 46);
        this.f48926h = elfParser.mo34123c(allocate, 48);
        this.f48927i = elfParser.mo34123c(allocate, 50);
    }
}
