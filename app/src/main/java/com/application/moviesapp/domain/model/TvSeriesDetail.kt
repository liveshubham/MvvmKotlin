package com.application.moviesapp.domain.model


data class TvSeriesDetail(
    val adult: Boolean?,

    val backdropPath: String?,

    val createdBy: List<CreatedBy?>?,

    val episodeRunTime: List<Int?>?,

    val firstAirDate: String?,

    val genres: String?,

    val homepage: String?,

    val id: Int?,

    val inProduction: Boolean?,

    val languages: List<String?>?,

    val lastAirDate: String?,

    val lastEpisodeToAir: LastEpisodeToAir?,

    val name: String?,

    val networks: List<Network?>?,

    val nextEpisodeToAir: NextEpisodeToAir?,

    val numberOfEpisodes: Int?,

    val numberOfSeasons: Int?,

    val originCountry: List<String?>?,

    val originalLanguage: String?,

    val originalName: String?,

    val overview: String?,

    val popularity: Double?,

    val posterPath: String?,

    val productionCompanies: List<ProductionCompany?>?,

    val productionCountries: List<ProductionCountry?>?,

    val seasons: List<Season?>?,

    val spokenLanguages: List<SpokenLanguage?>?,

    val status: String?,

    val tagline: String?,

    val type: String?,

    val voteAverage: Double?,

    val voteCount: Int?,

    //cast
    val cast: List<Cast?>?,
    val crew: List<Crew?>?,
) {

    data class CreatedBy(
        val id: Int?,

        val creditId: String?,

        val name: String?,

        val gender: Int?,

        val profilePath: String?
    )

    data class Genre(
        val id: Int?,

        val name: String?
    )

    data class LastEpisodeToAir(
        val airDate: String?,

        val episodeNumber: Int?,

        val episodeType: String?,

        val id: Int?,

        val name: String?,

        val overview: String?,

        val productionCode: String?,

        val runtime: Int?,

        val seasonNumber: Int?,

        val showId: Int?,

        val stillPath: String?,

        val voteAverage: Double?,

        val voteCount: Int?
    )

    data class Network(
        val id: Int?,

        val logoPath: String?,

        val name: String?,

        val originCountry: String?
    )

    data class NextEpisodeToAir(
        val airDate: String?,

        val episodeNumber: Int?,

        val episodeType: String?,

        val id: Int?,

        val name: String?,

        val overview: String?,

        val productionCode: String?,

        val runtime: Int?,

        val seasonNumber: Int?,

        val showId: Int?,

        val stillPath: String?,

        val voteAverage: Double?,

        val voteCount: Int?
    )

    data class ProductionCompany(
        val id: Int?,

        val logoPath: String?,

        val name: String?,

        val originCountry: String?
    )

    data class ProductionCountry(
        val iso: String?,

        val name: String?
    )

    data class Season(
        val airdate: String?,

        val episodeCount: Int?,

        val id: Int?,

        val name: String?,

        val overview: String?,

        val posterPath: String?,

        val seasonNumber: Int?,

        val voteAverage: Double?
    )

    data class SpokenLanguage(
        val englishName: String?,

        val iso: String?,

        val name: String?
    )

    data class Cast(

        val adult: Boolean?,

        val gender: Int?,

        val id: Int?,

        val knownForDepartment: String?,

        val name: String?,

        val order: Int?,

        val originalName: String?,

        val popularity: Double?,

        val profilePath: String?,

        val roles: List<Role?>?,

        val totalEpisodeCount: Int?
    ) {

        data class Role(
            val character: String?,

            val creditId: String?,

            val episodeCount: Int?
        )
    }

    data class Crew(

        val adult: Boolean?,

        val department: String?,

        val gender: Int?,

        val id: Int?,

        val jobs: List<Job?>?,

        val knownForDepartment: String?,

        val name: String?,

        val originalName: String?,

        val popularity: Double?,

        val profilePath: String?,

        val totalEpisodeCount: Int?
    ) {

        data class Job(
            val creditId: String?,

            val episodeCount: Int?,

            val job: String?
        )
    }
}