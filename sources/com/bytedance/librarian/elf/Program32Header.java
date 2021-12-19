package com.bytedance.librarian.elf;

import com.bytedance.librarian.elf.Elf;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class Program32Header extends Elf.ProgramHeader {
    public Program32Header(ElfParser elfParser, Elf.Header header, long j) {
        ByteOrder byteOrder;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        if (header.f48919a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        long j2 = header.f48921c + (j * ((long) header.f48923e));
        this.f48928a = elfParser.mo34122b(allocate, j2);
        this.f48929b = elfParser.mo34122b(allocate, 4 + j2);
        this.f48930c = elfParser.mo34122b(allocate, 8 + j2);
        this.f48931d = elfParser.mo34122b(allocate, j2 + 20);
    }
}
