bean { AppDbHelper(get()) }
    bean { AppDataManager(get(), get()) }
    bean {
        Room.databaseBuilder(androidApplication(), PendaftaranDatabase::class.java, "rsbrimob-db")
                .build()
    }

    bean { get<PendaftaranDatabase>().pendaftaranDao() }
}