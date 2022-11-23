package mavenproject.spotifyautomation;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

import io.restassured.response.Response;

public class spotify_api {
	public String userID = "31wldu2ajt7kgsakfrvgqq3tpzxe";
	public String token = "Bearer BQBdw0qHM9EtJ0xuHg2wRkXVav4cz0uqyrPWUslDx4PJmUYQIcDL6kXN06lvQEZ_gqqBOYRel7HGD2077eLKXt3sQKFT8Mp_2mbfWmCKneMcm5gpXGT9PwpRfQRc8AbAMflYQI6Xd7UwYoDE_R8t_6NeEcG3QxPKI9PbqeYt9BO5ITI0HYTs3-ypzENiZ0RQbjz5scHUcLzaxYi0QiVRtNBuo_FhcF14hlEVKeHkdIL_RCUoSCXQ6btLwD0fHh88Vzzoq-n50c3MUI4";
	//Get Current User's Profile
	@Test
	public void get() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/me");
		response.prettyPrint();
		String userid = response.path("id");
		
		System.out.println("--------------------------------------------");
		System.out.println("user id : " + userid);
		response.then().statusCode(200);
				
	}
	//Get User's Profile
	@Test
	public void getParticularUser() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/users/31wldu2ajt7kgsakfrvgqq3tpzxe");
		response.prettyPrint();
		response.then().statusCode(200);
	}
	//Get Current User's Playlists
	@Test
	public void getCurrentUserPlaylists() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/me/playlists");
		response.prettyPrint();
		response.then().statusCode(200);
	}
	//Get Playlist cover image
	@Test
	public void getPlaylistCoverImage() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/playlists/31wldu2ajt7kgsakfrvgqq3tpzxe/images");
		response.prettyPrint();
		//response.then().statusCode(200);
	}
	//Get playlist items
	public void getPlaylistItems() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/playlists/31wldu2ajt7kgsakfrvgqq3tpzxe/tracks");
		response.prettyPrint();
		response.then().statusCode(200);
	}
	//Get Playlist
	@Test
	public void getPlaylist() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/playlists/31wldu2ajt7kgsakfrvgqq3tpzxe");
		response.prettyPrint();
		//response.then().statusCode(200);
	}
	//Get User's Playlist
	@Test
	public void getUsersPlaylist() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/users/31wldu2ajt7kgsakfrvgqq3tpzxe/playlists");
		response.prettyPrint();
		//response.then().statusCode(200);
	}
	//Add Items to playlist
	@Test
	public void postItemstoPlaylist() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/playlists/31wldu2ajt7kgsakfrvgqq3tpzxe/tracks");
		response.prettyPrint();
	}
	//Create Playlist
	@Test
	public void postCreatePlaylist() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/users/31wldu2ajt7kgsakfrvgqq3tpzxe/playlists");
		response.prettyPrint();
		response.then().statusCode(200);
	}
	//Add Custom Playlist cover image
	@Test
	public void putCustomPlaylistCoverImage() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/playlists/31wldu2ajt7kgsakfrvgqq3tpzxe/images");
		response.prettyPrint();
	}
	//Update Playlist Items
	@Test
	public void putUpdatePlaylistItem() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/playlists/31wldu2ajt7kgsakfrvgqq3tpzxe/tracks");
		response.prettyPrint();
	}
	//Change Playlist Details
	@Test
	public void putChangePlaylistDetails() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/playlists/31wldu2ajt7kgsakfrvgqq3tpzxe");
		response.prettyPrint();
	}
	//Remove Playlist Items
	@Test
	public void deletePlaylistItems() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/playlists/31wldu2ajt7kgsakfrvgqq3tpzxe/tracks");
		response.prettyPrint();
	}
	//Get Tracks's Audio Analysis
	@Test
	public void getTrackAudioAnalysis() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/audio-analysis/31wldu2ajt7kgsakfrvgqq3tpzxe");
		response.prettyPrint();
	}
	//Get Track's audio features ids
	@Test
	public void getTrackAudioFeaturesIds() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/audio-features?ids=31wldu2ajt7kgsakfrvgqq3tpzxe");
		response.prettyPrint();
	}
	//Get Several Tracks
	@Test
	public void getSeveralTracks() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/tracks?ids=31wldu2ajt7kgsakfrvgqq3tpzxe");
		response.prettyPrint();
	}
	//Get Tracks
	@Test
	public void getTracks() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/tracks/31wldu2ajt7kgsakfrvgqq3tpzxe");
		response.prettyPrint();
	}
	//Get Several Shows
	@Test
	public void getSeveralShows() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/shows?ids=31wldu2ajt7kgsakfrvgqq3tpzxe");
		response.prettyPrint();
	}
	//Get Show Episodes
	@Test
	public void getShowEpisodes() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/shows/31wldu2ajt7kgsakfrvgqq3tpzxe/episodes");
		response.prettyPrint();
	}
	//Get Show
	@Test
	public void getShow() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/shows/31wldu2ajt7kgsakfrvgqq3tpzxe");
		response.prettyPrint();
	}
	//Search For Item
	@Test
	public void getSearchforItem() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/search?q=flok&type=artist");
		response.prettyPrint();
		response.then().statusCode(200);
	}
	//Get the user's queue
	@Test
	public void getUserQueue() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/me/player/queue");
		response.prettyPrint();
		response.then().statusCode(200);
	}
	//Get recently Played Tracks
	@Test
	public void getRecentlyPlayedTracks() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/me/player/recently-played");
		response.prettyPrint();
	}
	//Get Playback State
	@Test
	public void getPlaybackState() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/me/player");
		response.prettyPrint();
		}
	//Get Available Devices
	@Test
	public void getAvailabelDevices() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/me/player/devices");
		response.prettyPrint();
		response.then().statusCode(200);
		}
	//Get Currently Playing Track
	@Test
	public void getCurrentlyPlayedTrack() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/me/player/currently-playing");
		response.prettyPrint();
		}
	//Skip To Next
	@Test
	public void postSkiptoNext() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/me/player/next");
		response.prettyPrint();
		}
	//Skip To Previous
	@Test
	public void postSkiptoPrevious() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/me/player/previous");
		response.prettyPrint();
		}
	//Add Item to Playback Queue
	@Test
	public void postAddItemtoPlaybackQueue() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/me/player/queue?uri=31wldu2ajt7kgsakfrvgqq3tpzxe");
		response.prettyPrint();
		}
	//Pause Playback
	@Test
	public void putPausePlayback() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/me/player/pause");
		response.prettyPrint();
		}
	//Start/Resume Playback
	@Test
	public void putStartResumePlayback() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/me/player/play");
		response.prettyPrint();
		}
	//Set Repeat Mode
	@Test
	public void putRepeatMode() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/me/player/repeat?state=Delhi");
		response.prettyPrint();
		}
	//Seek To Position
	@Test
	public void putSeektoPosition() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/me/player/seek?position_ms=28000");
		response.prettyPrint();
		}
	//Toggle Playback Shuffle
	@Test
	public void putTooglePlaybackShuffle() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/me/player/shuffle?state=Maharastra");
		response.prettyPrint();
		}
	//Transfer Playback
	@Test
	public void putTransferPlayback() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/me/player");
		response.prettyPrint();
		}
	//Set Playback Volume
	@Test
	public void putSetPlaybackVolume() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/me/player/volume?volume_percent=55");
		response.prettyPrint();
		}
	//	Get Available Markets
	@Test
	public void getAvailableMarkets() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/markets");
		response.prettyPrint();
		response.then().statusCode(200);
		}
	//Get User's Top Items
	@Test
	public void getUserTopItems() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/me/top/artist");
		response.prettyPrint();
		}
	//Get Audiobook Chapters
	@Test
	public void getAudiobookChapters() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/audiobooks/31wldu2ajt7kgsakfrvgqq3tpzxe/chapters");
		response.prettyPrint();
		}
	//Get an Audiobook
	@Test
	public void getAudiobook() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/audiobooks/31wldu2ajt7kgsakfrvgqq3tpzxe");
		response.prettyPrint();
		}
	//	Get Several Audiobooks
	@Test
	public void getSeveralAudiobooks() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/audiobooks?ids=31wldu2ajt7kgsakfrvgqq3tpzxe");
		response.prettyPrint();
		response.then().statusCode(200);
		}
	//Get Album Tracks
	@Test
	public void getAlbumTrack() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/albums/31wldu2ajt7kgsakfrvgqq3tpzxe/tracks");
		response.prettyPrint();
		}
	//Get Album
	@Test
	public void getAlbum() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/albums/31wldu2ajt7kgsakfrvgqq3tpzxe");
		response.prettyPrint();
		}
	//Get Several Albums
	@Test
	public void getSeveralAlbums() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/albums?ids=31wldu2ajt7kgsakfrvgqq3tpzxe");
		response.prettyPrint();
		response.then().statusCode(200);
		}
	//Get Artist's Albums
	@Test
	public void getArtistAlbum() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/artists/31wldu2ajt7kgsakfrvgqq3tpzxe/albums");
		response.prettyPrint();
		}
	//	Get Artist's Related Artists
	@Test
	public void getArtistRealtedArtists() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/artists/31wldu2ajt7kgsakfrvgqq3tpzxe/related-artists");
		response.prettyPrint();
		}
	//Get Artist's Top Tracks
	@Test
	public void getArtistTopTracks() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/artists/31wldu2ajt7kgsakfrvgqq3tpzxe/top-tracks");
		response.prettyPrint();
		}
	//	Get Artist
	@Test
	public void getArtist() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/artists/31wldu2ajt7kgsakfrvgqq3tpzxe");
		response.prettyPrint();
		}
	//	Get Several Artists
	@Test
	public void getSeveralArtist() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/artists?ids=31wldu2ajt7kgsakfrvgqq3tpzxe");
		response.prettyPrint();
		response.then().statusCode(200);
		}
	//	Get Available Genre Seeds
	@Test
	public void getAvailableGenreSeeds() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/recommendations/available-genre-seeds");
		response.prettyPrint();
		response.then().statusCode(200);
		}
	//	Get Several Browse Categories
	@Test
	public void getSeveralBrowseCatagories() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/browse/categories");
		response.prettyPrint();
		response.then().statusCode(200);
		}
	//	Get Single Browse Category
	@Test
	public void getSingleBrowseCategory() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/browse/categories/dinner");
		response.prettyPrint();
		}
	//	Get Category's Playlists
	@Test
	public void getCategoryPlaylist() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/browse/categories/dinner/playlists");
		response.prettyPrint();
		}
	//Get Featured Playlists
	@Test
	public void getFeaturedPlaylist() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/browse/featured-playlists");
		response.prettyPrint();
		response.then().statusCode(200);
		}
	//	Get New Releases
	@Test
	public void getNewReleases() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/browse/new-releases");
		response.prettyPrint();
		response.then().statusCode(200);
		}
	//Get Recommendations
	@Test
	public void getRecommendations() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/recommendations?seed_artists=4NHQUGzhtTLFvgF5SZesLK&seed_genres=country&seed_tracks=0c6xIDDpzE81m2q797ordA");
		response.prettyPrint();
		response.then().statusCode(200);
		}
	//Check If User Follows Artists or Users
	@Test
	public void getCheckifUserFollowsArtistsorUsers() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/me/following/contains?type=artist&ids=31wldu2ajt7kgsakfrvgqq3tpzxe");
		response.prettyPrint();
		}
	//Get Followed Artists
	@Test
	public void getFollowedArtists() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/me/following?type=artist");
		response.prettyPrint();
		response.then().statusCode(200);
		}
	//	Check if Users Follow Playlist
	@Test
	public void getCheckifUsersFollowPlaylist() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/playlists/31wldu2ajt7kgsakfrvgqq3tpzxe/followers/contains?ids=31wldu2ajt7kgsakfrvgqq3tpzxe");
		response.prettyPrint();
		}
	//	Follow Artists or Users
	@Test
	public void putFollowArtistsorUsers() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/me/following?type=artist&ids=31wldu2ajt7kgsakfrvgqq3tpzxe");
		response.prettyPrint();
		}
	//	Follow Playlist
	@Test
	public void putFollowPlaylist() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/playlists/31wldu2ajt7kgsakfrvgqq3tpzxe/followers");
		response.prettyPrint();
		}
	//Unfollow Artists or Users
	@Test
	public void deleteUnfollowArtistsorUsers() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/me/following?type=artist&ids=31wldu2ajt7kgsakfrvgqq3tpzxe");
		response.prettyPrint();
		}
	//Unfollow Playlist
	@Test
	public void deleteUnfollowPlaylist() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/playlists/31wldu2ajt7kgsakfrvgqq3tpzxe/followers");
		response.prettyPrint();
		}
	@Test
	public void search() {
		Response response = given()
				.header("Accept","application/json")
				.header("Content-Type","application/json")
				.header("Authorization",token)
				.when()
				.get("https://api.spotify.com/v1/search?q=flok&type=tracks");
		response.prettyPrint();
		String h1 = response.path("images.height"); 
		System.out.println("Height is: " + h1);
	}
}
